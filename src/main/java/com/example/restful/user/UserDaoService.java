package com.example.restful.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
// @Component bean의 용도를 정확히 알고있기 때문에 @Service
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	
	private static int usersCount = 3;
	
	static {
		users.add(new User(1, "Kenneth", new Date()));
		users.add(new User(2, "Alice", new Date()));
		users.add(new User(3, "Elena", new Date()));
	}

	public List<User> findAll() {
		return users;
	}
	
	public User save(User user) {
		if(user.getId() == null) { // 아이디가 존재하지 않으면
			user.setId(++usersCount); // 아이디 지정
		}
		
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		for(User user : users) {
			if(user.getId() == id) {
				return user;
			}
		}
		
		return null;
	}
}
