package cgg.spring.securitydb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cgg.spring.securitydb.entities.User1;

public interface UserRepository extends JpaRepository<User1,Integer>{
	User1 findByUsername(String username);

}
