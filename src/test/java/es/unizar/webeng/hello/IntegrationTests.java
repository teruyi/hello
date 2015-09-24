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

public class IntegrationTests {

	@Autowired
    private WebApplicationContext wac;

	@Value("${app.message:Hello World}")
	private String message;	

	private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void testMessage() throws Exception {
        this.mockMvc.perform(get("/"))
        	.andDo(print())
            .andExpect(status().isOk())
            .andExpect(model().attribute("message", is(message)));
    }    
}
