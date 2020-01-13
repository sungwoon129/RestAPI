package kr.ac.kopo.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.kopo.model.User;
import kr.ac.kopo.service.UserService;

@Controller
public class UserController {
	
	UserService userService;
	
	@Inject
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(value="/signUp",method=RequestMethod.POST)
	public String signUp(User user) {
		
		userService.addUser(user);
		
		return "redirect:/item";
	}
	
	@RequestMapping(value="/isExist",method=RequestMethod.GET)
	@ResponseBody
	public int isExist(String inputType,String inputValue) {

		return userService.isExist(inputType,inputValue);
	}
	

}
