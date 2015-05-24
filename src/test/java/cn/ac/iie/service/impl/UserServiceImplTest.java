package cn.ac.iie.service.impl;

import cn.ac.iie.model.User;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mybatis.xml"})
// defaultRollback=true不会改变数据库，false会改变数据库
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class UserServiceImplTest {

	@Resource(name = "userService")
	private UserServiceImpl userService;


	public UserServiceImplTest() {
	}

	@Test
	public void testInsertUser() {
		User user = new User();
		user.setUname("张三");
		user.setUpassword("11111");
		user.setUsex(Boolean.TRUE);
		userService.add(user);
	}

	@Test
	public void testFindById() {
	}

}
