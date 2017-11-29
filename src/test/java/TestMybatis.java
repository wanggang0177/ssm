import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ssm.demo.service.IService;

@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(locations = {"classpath:spring.xml"})  
public class TestMybatis {

	@Autowired  
    private IService service;  
  
    @Test  
    public void test() {  
           String list=service.getData();  
           System.out.println(list);
//           logger.info(list);  
    }  
}
