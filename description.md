#Hello Application

###About
Hello is a web application that greets their clients and shows the current date and time. It is developed in Java and uses [Spring Framework] (http://projects.spring.io/spring-framework/).

###File organization
The project follows the recommended conventions about packaging and directories structure. The organization of the source code is explained in the next diagram:

```
src
|--main
|  |--java
|  |  |--es
|  |     |--unizar
|  |        |--webeng
|  |           |--hello
|  |              |--Application.java
|  |              |--HelloController.java
|  |--resources
|  |  |--application.properties
|  |--webapp
|     |--WEB-INF
|        |--jsp
|        |  |--wellcome.jsp (view)
|        |--web.xml (web server configuration)
|--test (tests should be placed here)
   |--java
      |--es
         |--unizar
            |--webeng
               |--hello
                  |--IntegrationTests.java
                  |--SystemTests.java
                  |--UnitTest.java
```

It is **strongly** recommended to follow this structure so as to maintain a clean and organized code.

###Running the server
The server can be easily executed by using `gradle run`, assuming Gradle has been properly set up. Then any client can connect and, if the application is working, the web will display the current date and time.
