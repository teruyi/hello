package es.unizar.webeng.hello;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.hamcrest.CoreMatchers.*;
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
@WebAppConfiguration

/**
* IntegrationTests
*
* Program that performs the integration tests of the application 'hello'
* Integration tests ensure the proper behaviour of the application
* and are tipically performed after system and unitary testing.
*
*/
public class IntegrationTests {

	  // Place an instance of WebApplicationContext into wac
		@Autowired
	    private WebApplicationContext wac;

		// Default value for message
		@Value("${app.message:Hello World}")
		private String message;

		//Create a new MockMvc for test
		private MockMvc mockMvc;

		/*
		 * Sentence to be executed before the test
		 */
	    @Before
	    public void setup() {
	    	// Connect the mockMvc to a WebApplicationContext
	        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	    }

		/*
		 * Intengration Test to verify Messages
		 */
	    @Test
	    public void testMessage() throws Exception {
	      // Perform a request and return a type that allows chaining further actions,
	    	// such as asserting expectations, on the result.
	    	this.mockMvc.perform(get("/"))						//Perform a petition
	        	.andDo(print())
	            .andExpect(status().isOk())								//Verify status is Ok
	            .andExpect(model().attribute("message", is(message)));	//Verify message equals message after print
	    }
	}
