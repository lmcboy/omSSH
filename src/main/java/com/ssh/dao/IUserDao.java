package com.ssh.dao;
import java.io.Serializable;

import com.ssh.model.User;

public interface IUserDao {

    /**
     * 保存用户
     * @param user
     * @return
     */
    Serializable save(User user); 
}