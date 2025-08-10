<h1 >Проект по автоматизации тестирования API для сайта <a href="https://reqres.in/">reqres.in</a></h1>

![WB_logo.jpg](media/logo/reqres_logo.png)

## :pushpin: Содержание:

* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Реализованные проверки</a>

* <a href="#console">Запуск тестов из терминала</a>

* <a href="#jenkins">Запуск тестов в Jenkins</a>

* <a href="#telegram">Уведомления в Telegram</a>

* <a href="#allure">Allure Report отчеты</a>

* <a href="#allure-testops">Интеграция с Allure TestOps</a>

* <a href="#jira">Интеграция с Jira</a>


<a id="tools"></a>
## Технологии и инструменты
<p align="center">
<code><a href="https://www.jetbrains.com/idea/"><img width="5%" title="IntelliJ IDEA" src="media/icons/Intelij_IDEA.svg"></a></code>
<code><a href="https://www.java.com/"><img width="5%" title="Java" src="media/icons/Java.svg"></a></code>
<code><a href="https://junit.org/junit5/"><img width="5%" title="JUnit5" src="media/icons/JUnit5.svg"></a></code>
<code><a href="https://gradle.org/"><img width="5%" title="Gradle" src="media/icons/Gradle.svg"></a></code>
<code><a href="https://github.com/"><img width="5%" title="GitHub" src="media/icons/GitHub.svg"></a></code>
<code><a href="https://www.jenkins.io/"><img width="5%" title="Jenkins" src="media/icons/Jenkins.svg"></a></code>
<code><a href="https://github.com/allure-framework/allure2"><img width="5%" title="Allure Report" src="media/icons/Allure_Report.svg"></a></code>
<code><a href="https://qameta.io/"><img width="5%" title="Allure TestOps" src="media/icons/AllureTestOps.svg"></a></code>
<code><a href="https://web.telegram.org/"><img width="5%" title="Telegram" src="media/icons/Telegram.svg"></a></code>
<code><a href="https://www.atlassian.com/software/jira"><img width="5%" title="Jira" src="media/icons/Jira.svg"></a></code>
</p>

Автотесты написаны на `Java`.\
`Gradle` - сборщик проекта.  \
`JUnit5` - для выполнения тестов.\
`Jenkins` - CI/CD для запуска тестов удаленно.\
`Allure Report` - для визуализации результатов тестирования.\
`Telegram Bot` - для уведомлений о результатах тестирования.\
`Allure TestOps` - как система управления тестированием.

<a id="cases"></a>

## :heavy_check_mark: Примеры автоматизированных тест-кейсов
- :white_check_mark: Корзина
    - :heavy_check_mark: Получение одного пользователя позитивный
    - :heavy_check_mark: Получение одного пользователя пользователь не найден
    - :heavy_check_mark: Регистрация нового пользователя
    - :heavy_check_mark: Создание нового пользователя
    - :heavy_check_mark: Удаление пользователя
    
<a id="console"></a>
##  Запуск тестов из терминала
### Локальный запуск тестов

```
gradle clean test  
```

<a id="jenkins"></a>
## <img src="media/logo/Jenkins.svg" width="25" height="25"/></a> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/35-Tigr0K-ReqresApiTests/)

<p align="center">

> Для запуска необходимо нажать "Собрать сейчас".

<https://jenkins.autotests.cloud/job/35-Tigr0K-ReqresApiTests/"><img src="media/screenshots/Jenkins.png" alt="Jenkins"/></a>

> При клике на сборку после завершения можно увидеть артефакты запуска и полезные ссылки для более детального изучения прогона.

<a href="https://jenkins.autotests.cloud/job/AD_demo_api_reqres/"><img src="media/screenshots/sborka.jpg" alt="Jenkins"/></a>
</p>

<a id="telegram"></a>
## <img src="media/logo/Telegram.svg" width="25" height="25"/></a> Уведомления в Telegram

<p >

> С помощью настроенного бота после завершения прогона в Jenkins поступают уведомления в Telegram.

<img title="telegram bot" src="media/screenshots/Telegram.PNG">
</p>

<a id="allure"></a>
## <img src="media/logo/Allure.svg" width="25" height="25"/></a> [Allure Report](https://jenkins.autotests.cloud/job/35-Tigr0K-ReqresApiTests/4/allure/) отчеты

### Основное окно

<p align="center">
<img title="Allure Dashboard" src="media/screenshots/AllureRep.PNG">
</p>

### Отчеты по тестам

<p align="center">

> В отчете по тестам присутствует развернутая информация по запросам и ответам.

<img title="Allure Tests" src="media/screenshots/">
</p>

<a id="allure-testops"></a>
## <img src="media/logo/Allure_TO.svg" width="25" height="25"/></a> Интеграция с [Allure TestOps]()

### Основное окно

<p align="center">
<img title="Allure TestOps" src="media/screenshots/">
</p>

### Тест кейсы

<p align="center">
<img title="Allure TestOps" src="media/screenshots/">
</p>

<a id="jira"></a>
## <img src="media/logo/Jira.svg" width="25" height="25"/></a> Интеграция с [Jira]()

<p align="center">
<img title="Jira" src="media/screenshots/">
</p>

