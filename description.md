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
