package cgg.spring.datajpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import cgg.spring.datajpa.dao.UserRepository;
import cgg.spring.datajpa.entities.UserOne;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		UserRepository userRepo= context.getBean(UserRepository.class);
//		saving single object
//		UserOne u1 = new UserOne();
//		u1.setName("Nandini");
//		u1.setCity("Hyd");
//		u1.setStatus("Iam a java developer");
//		
//		UserOne u11 = userRepo.save(u1);
//		System.out.println(u11);
		
//		UserOne u1 = new UserOne();
//		u1.setName("Divya");
//		u1.setCity("Hyd");
//		u1.setStatus("Iam a java developer");
//		
//		UserOne u2 = new UserOne();
//		u2.setName("Divya");
//		u2.setCity("Hyd");
//		u2.setStatus("Iam a Python developer");
//		
//		List<UserOne> users = List.of(u1,u2);
//		//save multiple objects
//		Iterable<UserOne> result = userRepo.saveAll(users);
//		
//		result.forEach(System.out::println);
		
		
		//update the user of id 3
//		Optional<UserOne> optional = userRepo.findById(3);
//		UserOne userOne = optional.get();
//		userOne.setName("Yash");
//		userOne.setCity("LBNagar");
//		userRepo.save(userOne);
		
		//how to get the data
		//findBy(id)-returns optional containing your data
		//findAll()
		
//		Iterable<UserOne> users = userRepo.findAll();
//		users.forEach(System.out::println);
		
		//deleting the user element
		
//		userRepo.deleteById(1);
//		System.out.println("Deleted");
		
		//deleting all users
//		Iterable<UserOne> users = userRepo.findAll();
//		users.forEach(System.out::println);
//		userRepo.deleteAll(users);
		
//		List<UserOne> user = userRepo.findByName("nandu");
//		user.forEach(System.out::println);
		
//		List<UserOne> user = userRepo.findByNameAndCity("nandu", "hyd");
//		user.forEach(System.out::println);
//		
//		List<UserOne> user = userRepo.findByStatusContaining("spring");
//		user.forEach(System.out::println);
		
//		List<UserOne> user = userRepo.findByStatusLike("%dev%");
//		user.forEach(System.out::println);
//		
		List<UserOne> allUsers = userRepo.getAllUsers();
		allUsers.forEach(System.out::println);
		
//		List<UserOne> list = userRepo.getUsersByName("nandu");
//		list.forEach(System.out::println);
		
//		List<UserOne> list = userRepo.getUsersByName("nandu", "hyd");
//		list.forEach(System.out::println);
		
//		List<UserOne> users = userRepo.getUsers();
//		users.forEach(System.out::println);
		
//		List<UserOne> users = userRepo.getUsersByCity("hyd");
//		users.forEach(System.out::println);
	}

}