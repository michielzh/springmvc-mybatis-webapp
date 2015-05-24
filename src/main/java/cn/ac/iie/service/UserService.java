package cn.ac.iie.service;

import cn.ac.iie.model.User;

public interface UserService {

	public int add(User user);

	public User get(int id);
	
	public boolean isExist(User user);
}
