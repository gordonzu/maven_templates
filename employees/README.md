# README

Maven Java EE 7 web application with embedded Tomcat and (fat) jar with dependencies assembly

Builds a Java EE 7 web app jar 

* Java 8 SE, Java EE 7

* Dependency on tomcat-embedded-core, tomcat-embedded-logging, tomcat-embedded-jasper 

* Dependency on tomcat-jasper, tomcat-jasper-el, tomcat-jsp-api

* Dependency on jstl

* Dependency on JUnit, Selenium

* Run: mvn clean install; mvn package; java -jar target/employees-app-1.0-SNAPSHOT-jar-with-dependencies.jar
       http://localhost:8080/


