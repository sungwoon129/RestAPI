package kr.ac.kopo.DB;


import java.sql.Connection;
import java.sql.DriverManager;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

 @RunWith(SpringJUnit4ClassRunner.class)
 @ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
 public class DBconnectionTest {
	
	private static final Logger log = LoggerFactory.getLogger(DBconnectionTest.class);
	
	@Inject
	private SqlSessionFactory factory;
	
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static final String USER = "simpleordersystem";
	private static final String PASSWORD = "1234";
	
	
	@Test
	public void testConnection() throws Exception{
		Class.forName(DRIVER);
		try(Connection connection = DriverManager.getConnection(URL,USER,PASSWORD)) {
			log.info("Oracle 연결성공: {}",connection);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testFactory() {
		log.info("{}",factory);
	}
	
	@Test
	public void testSession() throws Exception{
		
		try(SqlSession session = factory.openSession()) {
			log.info(session.toString());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
