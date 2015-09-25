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

###Building the project
Assuming that you have set up gradle in your computer type in your console:
*	$ cd hello
*	$ gradle build
	
###Testing your code
Testing your code is very easy. 
*	$ cd hello
*	$ gradle test
Last command will compile normal and tests classes in your project. Then test classes will be executed and tested.
Error message will appear in the screen if something has gone wrong.
	
	

###Spring Framework Annotations
You may find some [Spring Java annotations](http://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/context/annotation/package-tree.html) in specific pieces of code. The following annotations are used in this project:
* **@SpringBootApplication**: defines the main Spring Application class in this project. It must be a class annotation.
* **@Controller**: defines the main Spring Controller class in this project. It must be a class annotation.
* **@RunWith(Class)**: defines a Test Runner to run the tests instead of the one built in JUnit. It must be a class annotation.
* **@SpringApplicationConfiguration(classes = Class)**: defines a [ContextConfiguration](http://docs.spring.io/spring-framework/docs/4.1.7.RELEASE/javadoc-api/org/springframework/test/context/ContextConfiguration.html) class to load in an integration test. It must be a class annotation.
* **@WebAppConfiguration**: declares that the ApplicationContext loaded for an integration test should be a [WebApplicationContext](http://docs.spring.io/spring-framework/docs/3.2.0.BUILD-SNAPSHOT/api/org/springframework/test/context/web/WebAppConfiguration.html). It must be a class annotation.
* **@IntegrationTest("server.port=port")**: declares that the current test is an integration test. It must be a class annotation.
* **@DirtiesContext**: declares that the context related to this test should be removed from the context cache. It must be a class or method annotation.
* **@Value("${property:default_value}"): if the specified property exists, its value is assigned to a variable. Otherwise, the default value is assigned to that variable. It must be a variable annotation.
* **@Before**: declares that a function should be executed before running the tests. It must be a function annotation.
* **@Test**: declares that a function is a test. It must be a function annotation.

###Java Anotations
Java defines a set of annotations that are built into the language.

* **@Override**: Checks that the method is an override. Causes a compile error if the method is not found in one of the parent classes or implemented interfaces.

* **@Deprecated**: Marks the method as obsolete. Causes a compile warning if the method is used.

* **@SuppressWarnings**: Instructs the compiler to suppress the compile time warnings specified in the annotation parameters.

* **@SafeVarargs**: Suppress warnings for all callers of a method or constructor with a generics varargs parameter, since Java 7.

* **@FunctionalInterface**: Specifies that the type declaration is intended to be a functional interface, since Java 8.

###Javadoc
Javadoc is an Oracle's tool which generates documentation of Java API in HTML format based on Java code.

It's need using some reserved words preceded by "@" for Generating APIs. This words are wrote before a method or a class.

Coming up next, the using of the reserved words for Javadoc are going to be explained:

* **@author**: Indicates the Development's name.
* **@deprecated**: Indicates that a method or class is obsoleted and it is not recommended use it, due to it will probably desapear in the next version.
* **@param**: Defines a parameter of a method. It's required for each parameter in the method.
* **@return**: Informs of the element which return a method. It is forbidden in constructs and "void" methods.
* **@see**: Associates with another method or class.
* **@throws**: Informs of the exception which is throwed by a method.
* **@version**: Indicates de version of the method or class.

###More about the used technologies
This section present more information about the technologies which have been used in the application.


###Git Best Practises
In the next lines, there are some points which are important when we are using Git:

* Do read about git
* Do commit early and often
* Don't panic
* Do backups
* Don't change published history
* Do choose a workflow
* Do divide work into repositories
* Do make useful commit messages
* Do keep up to date
* Do periodic maintenance
* Do enforce Standards
* Do use useful tools
* Do integrate with external tools


###Travis.yml
Travis CI uses .travis.yml file in the root of your repository to learn about your project and how you want your builds to be executed.
