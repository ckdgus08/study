##### JOB생명주기 
1. job runner에 의해서 시작된다.
1. jobInstance는 job이름, parameter로 식별된다.
1. jobInstance는 JobRepository의 BATCH_JOB_INSTANCE, BATCH_JOB_EXECUTION_PARAMS 를 사용하여 식별한다.
   (BATCH_JOB_INSTANCE.JOB_KEY는 job 이름과 parameter의 해시 값임.)
1. job이 실행되면, job instance(job의 논리적 실행) -> jobExecution(job 실행시도) 순서대로 생성됨.
1. job이 성공적으로 실행되면 1개의 instance, execution이 생김.
1. job 실행중 오류가 발생한 후, instance를 실행하려고 할때마다 execution 추가로 생긴다. 
   (BATCH_JOB_EXECUTION_CONTEXT 테이블을 참조하여 오류가 발생했던 부분부터 이어서 실행한다.)
1. 실행완료된 execution이 있으면, job이 완료된 것으로 판단한다.