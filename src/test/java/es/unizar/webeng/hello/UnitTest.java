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
/*
* Indicates that the class should use Spring's JUnit facilities. SpringJUnit4ClassRunner is a custom extension of JUnit's BlockJUnit4ClassRunner
* which provides functionality of the Spring TestContext Framework
*/

@RunWith(SpringJUnit4ClassRunner.class)
/*
* SpringApplicationConfiguration is a Class which especifies how to load and configure
* an ApplicationContext for integration tests.
*/
@SpringApplicationConfiguration(classes = Application.class)

/*
* @WebAppConfiguration must be present in order to tell Spring that a WebApplicationContext should be loaded for the test
*/

public class UnitTest {

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
