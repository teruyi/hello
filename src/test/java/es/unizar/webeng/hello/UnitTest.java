package es.unizar.webeng.hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.HashMap;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class UnitTest {


	/*
    * This tag is used to set a default value from properties file
	*/
	@Value("${app.message:Hello World}")
	private String message;	

	@Autowired
	private HelloController controller;


    @Test
    public void testMessage() throws Exception {
    	HashMap<String,Object> map = new HashMap<>();		
    	String view = controller.welcome(map);
    	assertThat(view, is("wellcome"));
    	assertThat(map.containsKey("message"), is(true));
    	assertThat(map.get("message"), is(message));
    }    
}
