package com.itheima.ioc;

public class UserServicelmpl implements UserService{
    //����UserDao����
	private UserDao userDao;
	//���UserDao���Ե�setter����������ʵ������ע��
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	//ʵ�ֽӿ��еķ���
	@Override
	public void say() {
		// TODO ���� userDao�е�say()��������ִ��������
		this.userDao.say();
		System.out.println("userService say hello world !");
	}

}
