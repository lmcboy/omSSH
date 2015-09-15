package com.ssh.dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssh.dao.IUserDao;
import com.ssh.model.User;
@Repository("userDao")
public class UserDaoImpl implements IUserDao {
    
    /**
     * 使用@Autowired注解将sessionFactory注入到UserDaoImpl中
     */
    @Autowired
    private SessionFactory sessionFactory;
    
    public Serializable save(User user) {
        return sessionFactory.getCurrentSession().save(user);
    }
}
