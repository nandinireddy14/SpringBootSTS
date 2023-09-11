package cgg.spring.jdbc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cgg.spring.jdbc.entities.User1;

@RestController
public class UserController {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@GetMapping("/users")
	public ResponseEntity<List<User1>> getAllUsers() {

		List<User1> users = jdbcTemplate.query("SELECT * from user1", new DataClassRowMapper<User1>(User1.class));

		return new ResponseEntity<List<User1>>(users, HttpStatus.OK);

	}
	
	@PostMapping("/users")
	public ResponseEntity<User1> addUser(@RequestBody User1 user) {
		String query="insert into user1 values(?,?,?,?)";
		int i = jdbcTemplate.update(query,user.username(),user.password(),user.email(),user.role());
		return new ResponseEntity<User1>(user, HttpStatus.OK);
		
	}
}
