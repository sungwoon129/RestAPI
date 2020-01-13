package kr.ac.kopo.dao;

import java.util.List;

import kr.ac.kopo.model.Order;

public interface OrderDao {

	int isExist(String id);

	List<Order> getList();

	void addOrder(Order order);

	Boolean deleteOrder(int orderId);



}
