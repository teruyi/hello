package es.unizar.webeng.hello;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@Value("${app.message:Hello World}")
	private String message;
	/*
	 * The annotation @RequestMapping is used by Spring to
	 * know which Controller or which Controller’s method must
	 * each hhtp customer call be addressed to. In this case,
	 * we are informing that every http customer call to the
	 * homepage is going to be managed by the public method
	 * named “welcome” of our Controller.
	 */
	@RequestMapping("/")
	/**
	 * As it´s said before, every customer call to the homepage
	 * is addressed to this method. This method always returns
	 * the String “welcome”. In addition, it makes two new entries
	 * in the Map of Strings (as key) and Objects (as value)
	 * passed by parameter. The first one has the key “time”, and
	 * its value is a Date object which manages the current date.
	 * The second one has the key “message”, and its value is the
	 * reference to the String identified by “message” explained before.
         * @param model – Map which is going to be modified.
         * @return – This method always returns the String “welcome”.
	 */
	public String welcome(Map<String, Object> model) {
		/* It is made the first entry in the Map. */
		model.put("time", new Date());
		/* It is made the second entry in the Map. */
		model.put("message", message);
		return "wellcome";
	}		
}
