package kr.ac.kopo.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.model.Order;

@Repository
public class OrderDaoImpl implements OrderDao {
	
	@Inject
	SqlSession sql;
	
	@Override
	public int isExist(String id) {

		if(sql.selectOne("order.isExist",id) != null)
		return sql.selectOne("order.isExist",id);
		else return 0;
	}

	@Override
	public List<Order> getList() {
		return sql.selectList("order.getList");
	}

	@Override
	public void addOrder(Order order) {
		sql.insert("order.addOrder", order);
		
	}

	@Override
	public Boolean deleteOrder(int orderId) {
		if(sql.delete("order.deleteOrder", orderId) > 0 )
		return true;
		else return false;
	}



}
