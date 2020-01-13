package kr.ac.kopo.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class Order {

	private int orderId;
	private int itemId;
	private int amount;
	private String userId;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date applyDate;
	private String payMethod;
	private String phone;
	private String address;
	private String username;
	private String name;

}
