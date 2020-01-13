package kr.ac.kopo.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
@WebAppConfiguration
public class OrderControllerTest {
	
	private static final Logger log = LoggerFactory.getLogger(OrderControllerTest.class);
	
	@Inject
	WebApplicationContext wac;
	
	MockMvc mockMvc;
	
		
	@Before
	public void setUp() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	@Test
	public void request() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/"))
		.andExpect(status().isOk())
		.andExpect(forwardedUrl("/WEB-INF/views/index.jsp"))
		.andExpect(MockMvcResultMatchers.view().name("index"));
	}

}
