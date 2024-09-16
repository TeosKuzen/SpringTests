# 🤖 Проект по автоматизации тестирования API и генерации данных "chef-pro-tests" для проекта "ШефМаркет"
## <a target="_blank" href="https://www.chefmarket.ru/">Веб-сайт "ШефМаркет"</a>

![This is an image](https://play-lh.googleusercontent.com/E2w7c2hi5DCk_XBHRCWJlgCQp15j7ZjFc6PwtNnV0C1pDWzmmaEbooOyq-G8LNLwpg)

## 🚀 Содержание:

- <a href="#технологии-и-инструменты">Технологии и инструменты</a>
- <a href="#реализованные-процессы">Реализованные процессы</a>
- <a href="#проверить-установку-компонентов">Проверить установку компонентов</a>
- <a href="#подготовка-проекта">Подготовка проекта</a>
- <a href="#класс-pinCodePositiveTest">Класс PinCodePositiveTest</a>
  - <a href="#важно">Важно!!!</a>
- <a href="#класс-artisanscripts-в-процессе">Класс ArtisanScripts(В процессе)</a>

## 🚀 Технологии и инструменты:
<p align="center">
<img width="100%" title="Spring" src="images/logo/Spring_Framework_Logo_2018.svg">
<img width="10%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="10%" title="Java" src="images/logo/Java.svg">
<img width="10%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="10%" title="Maven" src="images/logo/Maven.svg">
<img width="10%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="10%" title="Gitlab" src="images/logo/Gitlab.svg">
<img width="10%" title="PostgreSql" src="images/logo/PostgreSQL_logo.3colors.svg">
<img width="10%" title="Git" src="images/logo/Git.svg">
<img width="10%" title="RestAssured" src="images/logo/RestAssured.svg">
<img width="10%" title="Lombok" src="images/logo/lombok.svg">
<img width="10%" title="Kubernetes" src="images/logo/cib-kubernetes-blue.svg">
<img width="10%" title="Kubernetes" src="images/logo/ssh-svgrepo-com.svg">

</p>

## 🚀 Реализованные процессы
![This is an image](https://i.imgur.com/Dd62Cq5.png)

1. [x] Подключение к БД "BE ChefPro"
2. [x] Конфигурация Spring Boot
3. [x] Подключение к k8s "cm-dev"
4. [x] Запуск автоматизированных тестов API

## Проверить установку компонентов

1. [ ] Maven
2. [ ] Java
3. [ ] Сборка проекта и зависимостей

## Подготовка проекта

1. Проверить свой ssh-клиент, нужно выполнить bash-скрипт

```bash
ssh -V
```
**При возникновении ошибки нужно установить ssh-клиент(либо включить его)**

**Выполните одну из следующих команд в PowerShell с правами администратора для установки/запуска ssh-клиента**
```
Add-WindowsCapability -Online -Name OpenSSH.Client~~~~0.0.1.0
```
```
Set-Service -Name ssh-agent -StartupType Automatic
Start-Service ssh-agent
```
**Необходимо с помощью команды:**
```bash
ssh-add -l
```
**Проверить состояние вашего приватного SSH-ключа. Если его нет, то необходимо создать его с защитой паролем**

**Затем можно с помощью ниже указанной команды проверить состояние подключения к серверу, подставив значения из конфигурации**
```bash
ssh username@hostname_or_ip
```
**Когда предварительная подготовка выполнена, необходимо указать путь к своему приватному ключу в конфигурационной переменной файла [application-test.yml](src/main/resources/application-test.yml)**

```yaml
privateKey: /путь к ssh-ключу
```
**и пароль** в переменной
```yaml
passphrase: ваш пароль
```

## Класс [PinCodePositiveTest](src/test/java/pro/chef/pincode/PinCodePositiveTest.java)

**В данном классе мы можем запустить свои первые автотесты**

### Важно!!!
Если по какой-то причине при запуске тестов возникают ошибки инициализации `dataSourceScriptDatabaseInitializer` или `'pro.chef.dao.configurators.SshTunnelConfig': Invocation of init method failed`

то закомментируйте с помощью Ctrl + / `класс DataSourceConfig` все классы `entity`, `repository` и `service`, а так же вызванные методы из классов, чтобы игнорировать конфигурацию подключения к БД`

### Структура класса

1. **Метод `checkRequestPinCodeTest` отправит первый API-тест, чтобы проверить работу `JSON-модели` и логирования с помощью `SLF4J`**
2. **Вызовом метода `testSQLQuery` мы можем проверить отправку SQL запроса, который вызывается из enum-класса [SQLQueries](src/main/java/pro/chef/dao/configurators/SqlQueries.java), в котором мы можем записывать шаблонные sql-запросы**
3. **Метод `testTableExists` на данный момент проверяет структуру `Entity>Repository>Service` SpringBoot, которая позволяет нам непосредственно получать свойства из смоделированной таблицы БД**

### Генерация отчетов allure

После выполнения любого автотеста, выполните команду, чтобы сгенерировать отчет allure по нему
````bash
mvn allure:serve
````

## Класс [ArtisanScripts](src/main/java/pro/chef/helpers/ArtisanScripts.java)`(В процессе)`

В данном методе реализована логика взаимодействия с k8s для выполнения `artisan-скриптов` для взаимодействия с сущностями ШМ.

Запуск метода `connectToK8s` в через `main` выполняет подключение логику подключения к куберу, поиска пода, выполнения скрипта и логирования содержимого пода

## Конфигурация БД

### Класс [DataSourceConfig](src/main/java/pro/chef/dao/configurators/DataSourceConfig.java)

Здесь мы с помощью аннотации `@Configuration` выстраиваем модель свойств подключения к БД, которая реализована в конфигурационном файле [application-test](src/main/resources/application-test.yml)

Для создания нового подключения необходимо в файле создать новый набор свойств для нового подключения и собрать отдельный класс конфигурации похожим образом.







