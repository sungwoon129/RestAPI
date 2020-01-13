package kr.ac.kopo.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.ac.kopo.dao.OrderDao;
import kr.ac.kopo.model.Order;


@Service
public class OrderServiceImpl implements OrderService {
	@Inject
	OrderDao dao;

	@Override
	public List<Order> getList() {
		return dao.getList();
	}



	@Override
	public int isExist(String id) {
		return dao.isExist(id);
	}



	@Override
	public void addOrder(Order order) {
		dao.addOrder(order);
	
	}



	@Override
	public Boolean deleteOrder(int orderId) {
		return dao.deleteOrder(orderId);
	}

}
