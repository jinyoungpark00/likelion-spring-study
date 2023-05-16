## 프로젝트 정보
- Spring Boot 3
- Java 17
- H2 Database


## 요구사항



### 필기
도메인: 서비스에서 사용되는 영역
- Entity(models.py)


client -> http mapping -> controller(django urls.py 느낌) -> 로직을 Service에서 처리 -> DB 호출 계층
(DB는 특적 계층에서만 호출을 함 why? DB는 중요하니까~)
Repository에서 DB를 호출함

Service는 Repository와 Domain과 연결



