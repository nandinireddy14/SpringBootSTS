package cgg.spring.restserver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cgg.spring.restserver.dao.UserRepository;
import cgg.spring.restserver.dto.UserDto;
import cgg.spring.restserver.entities.User1;
import cgg.spring.restserver.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	public UserDto getUserById(int id) {
		User1 user1=userRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("user","id",id));
		return userToUserDto(user1);
	}

	public List<UserDto> getAllUsers() {
		
		List<User1> users= userRepo.findAll();
		List<UserDto> userDtos = users.stream().map(user->userToUserDto(user)).collect(Collectors.toList());
		
		return userDtos;
	}

	public UserDto addUser(UserDto userDto) {
		User1 user = userDtoToUser(userDto);
		User1 savedUser = userRepo.save(user);
		
		return userToUserDto(savedUser);
	}
	public UserDto updateUser(UserDto userDto,int userId) {
		User1 user1=userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("user","id",userId));
		user1.setName(userDto.getName());
		user1.setEmail(userDto.getEmail());
		user1.setAbout(userDto.getAbout());
		user1.setPassword(userDto.getPassword());
		User1 updatedUser = userRepo.save(user1);
		
		return userToUserDto(updatedUser);
	}
	public void deleteUser(int userId) {
		User1 user1 = userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("user","id",userId));
		userRepo.delete(user1);
	}
	public User1 userDtoToUser(UserDto userDto) {
//		User1 user1 = new User1();
//		user1.setId(userDto.getId());
//		user1.setName(userDto.getName());
//		user1.setEmail(userDto.getEmail());
//		user1.setAbout(userDto.getAbout());
//		user1.setPassword(userDto.getPassword());
//		return user1;
		return modelMapper.map(userDto, User1.class);

	}
	public UserDto userToUserDto(User1 user1) {
//		UserDto userDto = new UserDto();
//		userDto.setAbout(user1.getAbout());
//		userDto.setEmail(user1.getEmail());
//		userDto.setId(user1.getId());
//		userDto.setName(user1.getName());
//		userDto.setPassword(user1.getPassword());
//		return userDto;
		return modelMapper.map(user1, UserDto.class);
		
	}
	
	
	

}
