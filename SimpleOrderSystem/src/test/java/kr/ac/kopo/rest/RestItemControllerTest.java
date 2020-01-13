package kr.ac.kopo.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

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
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import kr.ac.kopo.controller.OrderControllerTest;
import kr.ac.kopo.service.RestItemService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
@WebAppConfiguration
public class RestItemControllerTest {
	
	private static final Logger log = LoggerFactory.getLogger(OrderControllerTest.class);
	
	@Inject
	RestItemController restItemController;
	
	@Inject
	RestItemService restItemService;
	
	private MockMvc mockMvcController;
	private MockMvc mockMvcService;
	
	@Before
	public void setUp() throws Exception{
		mockMvcController = MockMvcBuilders.standaloneSetup(restItemController).build();
		mockMvcService = MockMvcBuilders.standaloneSetup(restItemService).build();
	}

	
	@Test
	public void isWellcontrollerMapping() throws Exception {
		mockMvcController.perform(get("/item")).andExpect(status().isOk());
	}
	
	@Test
	public void isWellrestControllerMapping() throws Exception {
		mockMvcService.perform(get("/item/list"))
		.andExpect(status().isOk());
									
	}
	
}
