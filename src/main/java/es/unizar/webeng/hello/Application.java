package es.unizar.webeng.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/*
 * The @SpringBootApplication annotation configures the web application, adding
 * automatically all the configurations of Spring and JEE, which normally had to
 * be done manually. Optatives: the @SpringBootApplication annotation is equivalent
 * to using @Configuration, @EnableAutoConfiguration and @ComponentScan with their
 * default attributes.
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
    //Inicializa el servidor/aplicación usando las clases de Spring
        SpringApplication.run(Application.class, args);
    }
    
    @Override
   /**
	* Overwrite configure method in order to customize 
	* the configuration of this application.
	* Sources or config classes can be added. 
	*
	* @param application 
	* @return original application with Application class added in sources
	*/
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}
