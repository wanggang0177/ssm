import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.druid.pool.DruidDataSource;
import com.mysql.jdbc.Driver;

import ssm.demo.model.User;
import ssm.demo.service.IService;

@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(locations = {"classpath:spring.xml"})  
public class TestMybatis {

	Logger logger = Logger.getLogger(TestMybatis.class);
	@Autowired  
    private IService service;  
  
	@Test
	public void insertTest(){
		User u = new User();
		u.setName("xxx");
		u.setAge(24);
		service.insert(u);
	}
	
//	@Test
//	public void deleteTest(){
//		System.out.println(service.deleteByPrimaryKey(5));
//	}
	
//	@Test
//	public void updateTest(){
//		User record = new User();
//		record.setId(8);
//		record.setName("888");
//		record.setAge(88);
//		service.updateByPrimaryKey(record);
//	}
	
	
//    @Test  
//    public void test() { 
//    	DruidDataSource druidDataSource = new DruidDataSource();
//    	druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
//    	druidDataSource.setUrl("jdbc:mysql://localhost:3306/mybatis?characterEncoding=utf8");
//    	druidDataSource.setUsername("root");
//    	druidDataSource.setPassword("123456");
//    	try {
//			System.out.println(druidDataSource.getConnection().getAutoCommit());
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
    	
//           String list=service.getData();  
//           System.out.println(list);
//           MDC.put("ip", "192.168.0.1");            
//           logger.info("message...");
//    }  
}
