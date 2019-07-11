# spring-cloud-exercise
The updated version (July 2019) of the exercise project of the course "Spring Cloud" by Frank P. Moley III that you can find on [Linkedin Learning](https://www.linkedin.com/learning/), originally at Lynda.com [here](https://www.lynda.com/Spring-Framework-tutorials/Spring-Spring-Cloud/590842-2.html)

The original version of the exercises was done with SpringBoot **1.5** using Spring Cloud **Dalston** release. Now it has been updated to SpringBoot **2.1** using Spring Cloud **Greenwich** release.

# Notable changes

## Maven dependencies

The artifact ids before were:

```
spring-cloud-starter-eureka
spring-cloud-starter-ribbon
spring-cloud-starter-feign
spring-cloud-starter-hystrix
spring-cloud-starter-hystrix-dashboard
```

The new artifact ids are:

```
spring-cloud-starter-netflix-eureka-client
spring-cloud-starter-netflix-ribbon
spring-cloud-starter-openfeign
spring-cloud-starter-netflix-hystrix  
spring-cloud-starter-netflix-hystrix-dashboard
```

## Hystrix

Since SpringBoot 2 for Hystrix to work you need to (port number is from this project):

* Add `management.endpoints.web.exposure.include=*` in `bootstrap.properties`
* Access it using this URL: http://localhost:8500/hystrix
* Use this URL for the stream: http://localhost:8500/actuator/hystrix.stream
