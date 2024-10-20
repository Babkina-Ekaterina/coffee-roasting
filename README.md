# Микросервис кофейной корпорации

## Стек технологий

- Java 17;
- Spring Boot 3;
- Hibernate;
- PostgreSQL;
- Swagger;
- Docker;
- JUnit;
- Mockito;
- Apache Kafka;
- REST;
- gRPC.

## Описание проекта

Созданное приложение является микросервисом, который выполняет следующие заявленные функции:
- Микросервис принимает сообщения через брокера сообщений Kafka о новом поступлении 
зерна, мешок зерна весит 60кг и имеет страну происхождения, % робусты и % арабики, 
а так же сорт зерна;
- По gRPC микросервис принимает информацию об обжарке поступившего зерна,
а именно какое количество взяли сорта и из какой страны происхождения, 
вес на выходе и номер бригады;
- По REST микросервис отдает информацию о количестве остатков по каждому сорту и 
стране с возможностью фильтровать запросы на стороне СУБД, информацию о бригадах какой 
у них % потери при обжарке, % потерь по каждой стране происхождения.

## Инструкция по запуску приложения

Чтобы запустить приложение, выполните следующие шаги:
1. Загрузите исходный код проекта на Ваш компьютер (например, клонируйте репозиторий с
   GitHub или скачайте код в ввиде архива);
2. Перейдите в каталог проекта;
3. Убедитесь, что Docker и Docker Compose установлены на Вашем компьютере;
4. В терминале выполните команду для сборки и запуска Docker-контейнеров:
```
docker-compose up
```
После того, как контейнеры будут запущены, приложение будет доступно по следующему адресу:
http://localhost:8080/api/storage

## Swagger
После запуска приложения описание всех запросов и возможность их протестировать доступны по
следующей ссылке: http://localhost:8080/swagger-ui/index.html

## Описание REST запросов

### 1. Получение информации о количестве остатков кофе по каждому сорту и стране

**Endpoint:** `http://localhost:8080/api/grain_stock/available`

**Метод:** `GET`

**Параметры (необязательные):** `originCountry`, `grainType`

**Пример ответа:**
```json
95
```

### 2. Получение информации о % потери при обжарке бригады, % потерь по каждой стране происхождения

**Endpoint:** `http://localhost:8080/api/roasting_loss`

**Метод:** `GET`

**Параметры (необязательные):** `originCountry`, `brigadeId`

**Пример ответа:**
```json
11999500
```