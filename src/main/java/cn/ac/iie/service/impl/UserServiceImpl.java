package cn.ac.iie.service.impl;

import cn.ac.iie.dao.UserMapper;

import cn.ac.iie.model.User;
import cn.ac.iie.service.UserService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource(name = "userDao")
	private UserMapper userDao;

	@Override
	public int add(User user) {
		int result = userDao.insert(user);
		return result;

	}

	@Override
	public User get(int id) {
		User user = userDao.selectByPrimaryKey(id);
		return user;
	}

	public boolean isExist(User user) {
		return true;
	}

}
