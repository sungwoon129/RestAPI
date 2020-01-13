package kr.ac.kopo.service;

import java.util.List;

import kr.ac.kopo.model.Order;


public interface OrderService {

	List<Order> getList();



	int isExist(String id);



	void addOrder(Order order);



	Boolean deleteOrder(int orderId);

}
