package kr.ac.kopo.dao;

import kr.ac.kopo.model.User;

public interface UserDao {

	void addUser(User user);

	int isExist(String inputType, String inputValue);

}
