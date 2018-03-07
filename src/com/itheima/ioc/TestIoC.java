package com.itheima.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoC {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.通过容器获取userDao实例
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		userDao.say();
		
	}

}
