package cgg.spring.securitydb.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cgg.spring.securitydb.entities.Role;
import cgg.spring.securitydb.entities.User1;

@Service
public class UserService {

	private List<User1> list=new ArrayList<>();
	
	public UserService() {
		list.add(new User1(1,"abc","abc",new Role(1,"ROLE_ADMIN")));
		list.add(new User1(2,"def","def",new Role(2,"ROLE_NORMAL")));
	}
	//get all users
	public List<User1> getAllUsers() {
		
		return this.list;
	}

//get single user
	public User1 getUser(String username) {
		
		return this.list.stream().filter(user->user.getUsername().equals(username)).findAny().orElse(null);
	}

	//add user
	public User1 addUser(User1 user) {
	this.list.add(user);
		return user;
	}
	

	
}
