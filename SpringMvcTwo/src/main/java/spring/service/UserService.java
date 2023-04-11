package spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.dao.UserDao;
import spring.dto.User;


@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public List<User> getUserList() {
		return userDao.getUserList();
	}

	public void createUser(User user) {
		userDao.addUser(user);
	}
}