package com.ssh.service;

import java.io.Serializable;

import com.ssh.model.User;

public interface IUserService {
	 /**
     * 测试方法
     */
    void test();
    /**
     * 保存用户
     * @param user
     * @return
     */
    Serializable save(User user); 
}
