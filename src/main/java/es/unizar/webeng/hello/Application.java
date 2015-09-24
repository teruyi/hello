package es.unizar.webeng.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
/**
* The @SpringBootApplication annotation is used to add the following characteristics:
*	The @ComponentScan annotation tells Spring to look for other components, configurations,
*	and services in the the hello package, allowing it to find the HelloController.
*
*	The @Configuration annotation tags the class as a source of bean definitions for the 
*	application context.
*
*	The @EnableAutoConfiguration annotation says to Spring Boot to start adding beans based
*	on classpath settings, other beans, and various property settings.
*/
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    /**
    * The @Override annotation was added in JDK 1.5 and it is used to instruct compiler that
    * method annotated with @Override is an overridden method from super class or interface
	*/
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}
