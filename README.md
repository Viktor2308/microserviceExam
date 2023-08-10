# microserviceExam
Основа приложения для генерации вопросов по разным предметам на экзамене, построенного на микросервисной архитектуре

Первым запускается "ServerEureka" - разворачивает сервер для взаимодействия микросервисов
- Java 17
- Spring Cloud Starter Netflix Eureka Server
---
Микросервис "exam" - принимает название предмета и количество вопросов, делает запрос в соответствующий предмету микросервис и возвращает список вопросов.
- Java 17
- Spring Cloud Starter Netflix Eureka Client
- Spring boot starter web
---
Микросервис historic - генерирует вопросы по истории и возвращает в "exam"
- Java 17
- Spring Cloud Starter Netflix Eureka Client
- Spring boot starter web
- Spring boot data rest
- Spring boot data jpa
- h2 database
---
Микросервис math - генерирует примеры по математике и возвращает в "exam"
- Java 17
- Spring Cloud Starter Netflix Eureka Client
- Spring boot starter web
