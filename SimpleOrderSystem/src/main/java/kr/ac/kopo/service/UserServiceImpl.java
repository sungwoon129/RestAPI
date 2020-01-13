package kr.ac.kopo.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.ac.kopo.dao.UserDao;
import kr.ac.kopo.model.User;

@Service
public class UserServiceImpl implements UserService {

	UserDao userDao;
	
	@Inject
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}

	@Override
	public int isExist(String inputType, String inputValue) {
		return userDao.isExist(inputType,inputValue);
	}



}
