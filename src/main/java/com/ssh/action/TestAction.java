package com.ssh.action;

import java.util.Date;
import java.util.UUID;

import com.ssh.model.User;
import com.ssh.service.IUserService;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

@ParentPackage("basePackage")
@Action(value="om")//使用convention-plugin插件提供的@Action注解将一个普通java类标注为一个可以处理用户请求的Action，Action的名字为struts2Test
@Namespace("/")//使用convention-plugin插件提供的@Namespace注解为这个Action指定一个命名空间
public class TestAction {
    
    /**
     * 注入userService
     */
    @Autowired
    private IUserService userService;

} 