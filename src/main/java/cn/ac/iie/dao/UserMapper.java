package cn.ac.iie.dao;

import cn.ac.iie.model.User;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public interface UserMapper {

	int deleteByPrimaryKey(Integer uid);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer uid);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}
