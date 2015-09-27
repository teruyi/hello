package es.unizar.webeng.hello;

import org.springframework.web.servlet.config.annotation.*;
import org.springframework.context.annotation.*;

@Configuration
public class StaticResourceConfiguration extends WebMvcConfigurerAdapter {
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registery) {
		registery.addResourceHandler("/resources/static/**").addResourceLocations("/resources/static");
	}
}
