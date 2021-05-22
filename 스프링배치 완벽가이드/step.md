##### step

1. job 의 구성요소
1. 각각의 스텝은 독립적, 순차적으로 처리된다.
1. 단위 작업의 조각이다.
1. 자체적으로 입력 처리, 가공, 출력처리 가능.
1. 트랜잭션은 스탭 내에서 이루어짐.

1. 테스크릿모델(return RepeatStatus.FINISHED 될때까지 반복되도록), 청크기반 처리 모델(itemReader, itemProcessor, itemWriter) 로 나뉜다.
1. ItemReader : db, file 등등 다양한 방식을 통해 메모리로 데이터를 읽어옴.
1. ItemProcessor : 메모리에 읽어들인 아이템을 반복적으로 특정 동작(가공) 처리함.
1. ItemReader : IO최적화를 위하여, 모든 아이템이 처리된 후 물리적쓰기 과정을 일괄처리함.

#### 여러가지 유형 Tasklet

1. Tasklet interface 구현하기

```java
    @Bean
public Step Step(){
        return this.stepBuilderFactory.get("Step")
        .tasklet(tasklet())
        .tasklet((contribution,chunkContext)->{
        System.out.println("run step!!!");
        return RepeatStatus.FINISHED;
        })
        .build();
        }
```

2. CallableTaskAdapter 사용하기

스탭이 실행되는 쓰레드와 별개의 쓰레드에서 실행된다. 하지만, 병렬로 처리되는 것은 아니다. RepeatStatus가 반환되기 전 까지는 완료되지 않은 것으로 판단되어, 다음 step 동작을 실행하지 않는다.

```java
@Bean
public Step callableStep(){
        return this.stepBuilderFactory.get("callableStep")
        .tasklet(tasklet())
        .build();
        }

@Bean
public Callable<RepeatStatus> callableObject(){
        return()->{
        System.out.println("This was Executed in another thread");
        return RepeatStatus.FINISHED;
        };
        }

@Bean
public CallableTaskletAdapter tasklet(){
        CallableTaskletAdapter callableTaskletAdapter=new CallableTaskletAdapter();

        callableTaskletAdapter.setCallable(callableObject());

        return callableTaskletAdapter;
        }
```

3. MethodInvokingTaskletAdapter 사용하기

다른 클래스에서 작성한 custom 메서드를 래핑하여 tasklet을 만들지 않고, MethodInvokingTaskletAdapter를 사용하여 호출 할 수 있다.

```java
@Bean
public Step methodInvokingStep(){
        return this.stepBuilderFactory.get("methodInvokingStep")
        .tasklet(methodInvokingTaskletAdapter())
        .build();
        }

@Bean
public MethodInvokingTaskletAdapter methodInvokingTaskletAdapter(){
        MethodInvokingTaskletAdapter methodInvokingTaskletAdapter=new MethodInvokingTaskletAdapter();

        methodInvokingTaskletAdapter.setTargetObject(service());
        methodInvokingTaskletAdapter.setTargetMethod("serviceMethod");
        return methodInvokingTaskletAdapter;
        }

@Bean
public CustomService service(){
        return new CustomService();
        }

public class CustomService {

    public void serviceMethod() {
        System.out.println("Service method was called");
    }
}
```

4. SystemCommandTasklet

System 명령어를 실행할때 사용되며, 비동기로 실행된다. 비동기로 실행되지만, 해당 동작이 성공적으로 수행되었는지 주기적으로 체크한다.(setTerminationCheckInterval 함수)

동기 방식으로 실행하게되면 Lock이 걸릴 수 있으므로 동기로 실행하는 것을 추천하지 않는다.

```java
@Bean
public Step SystemCommandStep(){
        return this.stepBuilderFactory.get("SystemCommandStep")
        .tasklet(systemCommandTasklet())
        .build();
        }

@Bean
public SystemCommandTasklet systemCommandTasklet(){
        SystemCommandTasklet tasklet=new SystemCommandTasklet();

        tasklet.setCommand("touch tem.txt");
        tasklet.setTimeout(5000);
        tasklet.setInterruptOnCancel(true);

        tasklet.setWorkingDirectory("/Users/cch/project/spring_batch");
        // cd "/Users/cch/project/spring_batch" 와 같은 명령임.

        tasklet.setSystemProcessExitCodeMapper(new SimpleSystemProcessExitCodeMapper());
        tasklet.setTerminationCheckInterval(5000);
        tasklet.setTaskExecutor(new SimpleAsyncTaskExecutor());
        tasklet.setEnvironmentParams(new String[]{"JAVA_HOME=/java","BATCH_HOME=/Users/batch"});

        return tasklet;
        }
```