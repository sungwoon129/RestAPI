package kr.ac.kopo.dao;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.model.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	SqlSession sql;
	
	@Inject
	public UserDaoImpl(SqlSession sql) {
		this.sql = sql;
	}
	
	@Override
	public void addUser(User user) {
		sql.insert("user.add", user);
	}

	@Override
	public int isExist(String inputType, String inputValue) {
		Map<String,Object> map = new HashMap<>();
		map.put("inputType", inputType);
		map.put("inputValue", inputValue);
		
		return sql.selectOne("user.isExist", map);
	}

}
