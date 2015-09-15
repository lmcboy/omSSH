package com.ssh.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssh.service.IUserService;

public class TestSpring {
	@Test
    public void test(){
//        //通过spring.xml配置文件创建Spring的应用程序上下文环境
//        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml");
//        //从Spring的IOC容器中获取bean对象
//        IUserService userService = (IUserService) ac.getBean("userService");
//        //执行测试方法
//        userService.test();
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-hibernate.xml"});
        //从Spring的IOC容器中获取bean对象
        IUserService userService = (IUserService) ac.getBean("userService");
        //执行测试方法
        userService.test();
    }
}
