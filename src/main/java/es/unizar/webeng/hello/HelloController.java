package es.unizar.webeng.hello;

/* Imports java utilities */
import java.util.Date;
import java.util.Map;

/* Imports the SpringFramework's libraries */
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
	 * The annotation @RequestMapping is used by Spring to
	 * know which Controller or which Controller’s method must
	 * each http customer call be addressed to. In this case,
	 * we are informing that every http customer call to the
	 * homepage is going to be managed by the public method
	 * named “welcome” of our Controller.
	 */
	@RequestMapping("/")
	
	
	/**
	* It is called when a HTTP request is made to the root path, as indicated by
	* @RequestMapping("/") annotation. In this case, HTTP method is not specified, 
	* so it will be called regardless the used method.
	* 
	* In addition, it makes two new entries in the Map of Strings (as key)
	* and Objects (as value) passed by parameter. The first one has the key “time”, and
	* its value is a Date object which manages the current date.
	* The second one has the key “message”, and its value is the
	* reference to the String identified by “message” explained before.
	*
	* @param model This parameter is used for passing data from the controller 
	* to the view.
	* Controller adds key-value pairs to the model and the view access them with 
	* the ${key} syntax. When rendering, ${key} is replaced with its value.
	*
	* @return The name of the view responsible for rendering the HTML page. 
	* As "welcome" is returned, "welcome.jsp" file will render the page.
	*/
	public String welcome(Map<String, Object> model) {
		/* It is made the first entry in the Map. Displays the current date and time, 
			including the day of the week, the time zone and the Daylight Saving Time
			or the Winter Time */
		model.put("time", new Date());
		/* It is made the second entry in the Map. Displays the message, by default, 
			his value is defined in the application properties, located in
			the main app resources */
		model.put("message", message);
		return "welcome";
	}		
}
