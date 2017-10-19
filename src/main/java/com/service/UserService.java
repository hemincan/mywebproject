package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.User;
import com.mapper.UserMapper;


/**
 * @author gacl
 * 使用@Service注解将UserServiceImpl类标注为一个service
 * service的id是userService
 */
@Service
public class UserService {

    /**
     * 使用@Autowired注解标注userMapper变量，
     * 当需要使用UserMapper时，Spring就会自动注入UserMapper
     */
	@Autowired
    private UserMapper userMapper;//注入dao

 
    public void addUser(User user) {
    	List<User> userlist=userMapper.findPage( 1, 2);
    	System.out.println(userlist.size());
        userMapper.insert(user);
    }

 
    public User getUserById(String userId) {
  
        return userMapper.selectByPrimaryKey(userId);
    }
}