package kr.ac.kopo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {

	@RequestMapping(value="/orderItem",method=RequestMethod.GET)
	public String order() {
		return "order";
	}
	
	@RequestMapping(value="/orderHistory",method=RequestMethod.GET)
	public String orderHistory() {
		return "orderHistory";
	}
	

}
