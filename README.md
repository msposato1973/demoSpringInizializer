# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.2/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.2/reference/htmlsingle/#boot-features-developing-web-applications)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.6.2/reference/htmlsingle/#boot-features-spring-mvc-template-engines)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.6.2/reference/htmlsingle/#using-boot-devtools)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)

## _The Last Markdown Editor, Ever_

- TTechnology
- Java
- Spring Boot, REST API, Thymeleaf, Bootstrap, Commons CSV
- REST API, Thymeleaf, Bootstrap, Commons CSV
- Thymeleaf, Bootstrap, Commons CSV
- Bootstrap, Commons CSV
- Commons CSV

## Description

Java Spring Boot web application to track reported data of confirmed Coronavirus infections 
COVID-19 (2019-nCoV) around the world. Here for the frontend, I use Thyemleaf and Spring Boot as backend. In my application,
I have a model, which represents formal underlying data constructs ,
that the View uses to present the user with the look and feel of the application. Have a controller to maps user requests and handles them and calls the service if needed. And the service layer fetches the data from a covid-19 API, 
and here I use Commons CSV to reads and writes files in variations of the Comma Separated Value (CSV) format from the API..

# Requirements
For building and running the application you need:
- JDK 1.8
- Java 11
- Maven 3

## Installation
There are several ways to run a Spring Boot application on your local machine. One way is to execute the main method in the de.codecentric.springbootsample.Application class from your IDE.

Alternatively you can use the Spring Boot Maven plugin like so:
```sh
mvn spring-boot:run