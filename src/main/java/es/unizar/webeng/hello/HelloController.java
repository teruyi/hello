package es.unizar.webeng.hello;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
   /*
    * This tag is used to set a default value from properties file
	*/
	@Value("${app.message:Hello World}")
	private String message;	
	
   /*
	* This tag is used by Spring to redirect each client call
	* to this method
	*/	
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", message);
		return "wellcome";
	}		
}
