package com.ssh.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssh.dao.IUserDao;
import com.ssh.model.User;
import com.ssh.service.IUserService;

//使用Spring提供的@Service注解将UserServiceImpl标注为一个Service
@Service("userService")
public class UserServiceImpl implements IUserService {
	/**
     * 注入userDao
     */
    @Autowired
    private IUserDao userDao;
  public void test() {
      System.out.println("Hello World!");
  }
  public Serializable save(User user) {
      return userDao.save(user);
  }
}