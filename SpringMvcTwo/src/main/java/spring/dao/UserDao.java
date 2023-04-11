package spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import spring.dto.User;

@Repository
public class UserDao {
private static List<User> list = null;
	static{
		list = new ArrayList<User>();
		list.add(new User("Ruchitha", 23, "ruchi@gmail.com", "India"));
		list.add(new User("Pranaya", 27, "prana.s@gmail.com", "US"));
		list.add(new User("Sanvy", 21, "sanvy@gmail.com", "Canada"));
	}
	public List<User> getUserList() {
		return list;
	}
	public void addUser(User user) {
		list.add(user);
	}
}