package kr.ac.kopo.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.model.Item;

@Repository
public class ItemDaoImpl implements ItemDao {
	
	private SqlSession sql;
	
	@Inject
	public ItemDaoImpl(SqlSession sql) {
		this.sql = sql;
	}

	@Override
	public List<Item> findAllItem() {
		return sql.selectList("item.findAllItem");
		
	}

	@Override
	public Item findById(int itemId) {
		return sql.selectOne("item.findById", itemId);
	}

}
