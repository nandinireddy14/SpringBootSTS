package cgg.spring.restserver.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cgg.spring.restserver.dto.UserDto;
import cgg.spring.restserver.entities.User1;
import cgg.spring.restserver.payload.ApiResponse;
import cgg.spring.restserver.services.UserService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public ResponseEntity<List<UserDto>> getAllUsers() {
		List<UserDto> list = userService.getAllUsers();
		return new ResponseEntity<>(list, HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public ResponseEntity<UserDto> getUserById(@PathVariable int id) {
		UserDto userDto = userService.getUserById(id);
		return ResponseEntity.ok(userDto);
	}
	// post create users

	@PostMapping(value = "/")
	public ResponseEntity<UserDto> addUser(@Valid @RequestBody UserDto userdto) {

		UserDto createdUserDto = userService.addUser(userdto);
		return new ResponseEntity<UserDto>(createdUserDto, HttpStatus.CREATED);
	}

	// put-update user
	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto,@PathVariable("userId") int uId){
		UserDto updatedUserDto = userService.updateUser(userDto, uId);
		return ResponseEntity.ok(updatedUserDto);
	}

	// delete -delete user
	@DeleteMapping("/{userId}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable("userId") int uId){
		userService.deleteUser(uId);
		return new ResponseEntity<ApiResponse> (new ApiResponse("user deleted successfully",true),HttpStatus.OK);
	}
}
