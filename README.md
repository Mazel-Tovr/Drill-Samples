# Drill-Maven-Samples

## <p align="center"> Visit our <a href="https://drill4j.github.io/"> github.io page</a> to get more infomation </p>
[![Drill in action](https://img.youtube.com/vi/N_WJYrt5qNc/maxresdefault.jpg)](https://www.youtube.com/watch?v=N_WJYrt5qNc&feature=emb_logo)

## Table of contents
1. [Preparation env for latest versions](#Preparation-env-for-latest-versions)
2. [Versions](#Versions)
3. [Common Start and register app](#Common-Start-and-register-app)
4. [Using Test2Code plugin](#Using-Test2Code-plugin)
    - [Start Autotests](#Start-Autotests)
    - [Manual Browser extension](#Manual-Browser-extension)

## Preparation env for latest versions

- <a href="https://www.docker.com/products/docker-desktop">Download docker</a>
- Download latest version of drill agent for your OS 
- Unzip it
- Go to folder /maven-sample/spring-petclinic in pom.xml file set value to "pathToAgent" property

## Versions

|Component   | Release | Stable | Latest | Description|
|:----------:|:-----:|:-------:|:---------:|:----|
|Admin-ui| <a href="https://github.com/Drill4J/admin-ui/releases/tag/v0.6.0">v0.6.0</a> | - | <a href="https://github.com/Drill4J/admin-ui/releases/tag/v0.7.0-155">v0.7.0-155</a> | Drill-Ui <a href="https://github.com/Drill4J/admin-ui">learn more</a>|
|Admin-backend| <a href="https://github.com/Drill4J/admin/releases/tag/v0.6.0">v0.6.0</a> | - | <a href="https://github.com/Drill4J/admin/releases/tag/v0.7.0-72">v0.7.0-72</a> | BackEnd <a href="https://github.com/Drill4J/admin">learn more</a>|
|Test2Code plugin| <a href="https://github.com/Drill4J/test2code-plugin/releases/tag/v0.6.0">v0.6.0</a> | - | <a href="https://github.com/Drill4J/test2code-plugin/releases/tag/v0.7.0-106">v0.7.0-106</a> | Test2Code plugin <a href="https://github.com/Drill4J/test2code-plugin">learn more</a> |
|Java agent| <a href="https://github.com/Drill4J/java-agent/releases/tag/v0.6.0">v0.6.0</a> | - | <a href="https://github.com/Drill4J/java-agent/releases/tag/v0.7.0-24">v0.7.0-24</a> | Java agent <a href="https://github.com/Drill4J/java-agent">learn more</a> |
|Autotest agent| <a href="https://github.com/Drill4J/autotest-agent/releases/tag/v0.6.0">v0.6.0</a> | - | <a href="https://github.com/Drill4J/autotest-agent/releases/tag/v0.12.0">v0.12.0</a> | Autotest agent <a href="https://github.com/Drill4J/autotest-agent">learn more</a> |
|Browser extantion| <a href="https://github.com/Drill4J/browser-extension/releases/tag/v0.3.16">v0.3.16</a> | - | <a href="https://github.com/Drill4J/browser-extension/releases/tag/v0.3.27">v0.3.27</a> | Browser extantion <a href="https://github.com/Drill4J/browser-extension">learn more</a> |

## Common Start and register app
- Launch docker
- Go to folder /admin run console and write ```docker-compose up```
- Launch "spring-petclinic" application applictation took from <a href="https://github.com/Drill4J/spring-petclinic">here</a> 
    - go to /maven-sample/spring-petclinic and write ```mvnw spring-boot:run```
    - or in idea run maven task spring-boot:run
    
- When the application is launched follow the link http://localhost:3000 and register the agent
    - Register agent ![alt text](img/register.png)
    - Set package ![alt text](img/registerPackage.png)
    - Add test2code plugin ![alt text](img/registerTest2code.png)
   
#### Links

- Admin UI: http://localhost:3000
- Admin Backend Swagger: http://localhost:8090

## Using Test2Code plugin
### Start Autotests

- Go to one of autotest repositories
- In console write ```mvnw test```
- or in idea run "test" task

### Manual Browser extension
//TODO
