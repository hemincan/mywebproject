package com.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.User;
import com.service.UserService;

@Controller
public class TestController {
	@Autowired
	private UserService service = null;

	@RequestMapping("/test")
	@ResponseBody
	public String test() {

		User user = new User();
		user.setUserBirthday(new Date());
		user.setUserName("name");
		user.setUserSalary(12.0);
		user.setUserId("111");
		service.addUser(user);
		return "Hello worldwefwsedf";
	}
}
