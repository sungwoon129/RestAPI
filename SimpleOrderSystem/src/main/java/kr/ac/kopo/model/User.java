package kr.ac.kopo.model;

import lombok.Data;

@Data
public class User {
	private int userId;
	private String username;
	private String password;
	private String email;
	private String address;
	private String phone;
	
	
}
