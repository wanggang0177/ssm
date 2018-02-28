package ssm.demo.service;

import ssm.demo.model.User;

public interface IService {

	int insert(User record);
	
	int deleteByPrimaryKey(Integer id);
	
	int updateByPrimaryKey(User record);
	
	User selectByPrimaryKey(Integer id);
	
	String getData(); 
}
