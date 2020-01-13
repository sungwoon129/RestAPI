package kr.ac.kopo.service;

import kr.ac.kopo.model.User;

public interface UserService {

	void addUser(User user);

	int isExist(String inputType, String inputValue);







}
