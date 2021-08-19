### Little's Law 사전적 의미

Little's law (리틀의 법칙)은 고정 시스템에서 고객의 장기 평균 수가, 장기 평균 유효 도착률에 고객이 시스템에서 소비하는 평균 시간을 곱한 것과 같다는 John Little의 정리이다.

### Little's Law 와 성능테스트

Little's Law를 다시 얘기하자면, 공간 내에 머무는 고객 수(L)은 고객이 유입되는 양과(λ)과 고객이 머무는 시간(W)에 비례한다는 것이다.

이를 it서비스의 유입량으로 표현하자면, 공간내에 머무르는 객체수(Active User)는 객체의 유입량(TPS)과 객체가 머무르는 시간(Response Time)에 비례한다 라고 표현할 수 있다.

 > CU(동시사용자) = λ(TbS) × W(Response Time + Think Time)

- CU : Concurrent User(동시사용자) 혹은 Virtual User(가상 사용자)
- Think Time : 사용자가 서비스 사용 중간에 웹페이지를 보거나 생각하는 시간
- TPS : 초당 트랜잭션

예를 들어 TPS가 10이고, 객체가 머무르는 시간이 10이라면 동시사용자는 100명이라고 할 수 있다.

아래 보이는 그래프는 사용자가 늘어남에 따라 tps, response time의 일반적인 경향을 나타낸다.
![이미지](https://github.com/ckdgus08/study/blob/master/image/tpsResponseTime.png?raw=true)

### 결론
동일한 성능의 서버, 동일한 부하레벨에서 응답시간, 지연시간이 낮을수록 시스템 성능이 높아진다. 즉 성능을 개선하기 위한 핵심은 응답시간을 낮추는 것이라고 할 수 있다.

참고한 사이트 :
- [[와탭 5분 세미나] Little's Law 수식 성능테스트에서 활용하기](https://www.youtube.com/watch?v=UqZBqs1Yle8)
- [Little's Law와 성능 테스트](https://www.whatap.io/ko/blog/63/)
- [Little's Law](https://performance.tistory.com/3)
