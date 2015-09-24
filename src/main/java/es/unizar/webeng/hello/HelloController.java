package es.unizar.webeng.hello;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * This annotation indicates that HelloController takes the 
 * role of a controller
 */
@Controller
public class HelloController {
   /*
    * This annotation is used to set a default value from properties file
	*/
	@Value("${app.message:Hello World}")
	private String message;	
	
   /*
	* This annotation is used by Spring to redirect each client call
	* to this method
	*/	
	@RequestMapping("/")
	
   /**
	* This method assigns the date and the message
	* to the data structure called model in order 
	* to pass data from the controller to the view. 
	*
	* @return the name of the corresponding view, in
	* this case wellcome.jsp
	*/
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", message);
		return "wellcome";
	}		
}
