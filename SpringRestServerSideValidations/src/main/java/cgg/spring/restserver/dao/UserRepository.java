package cgg.spring.restserver.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cgg.spring.restserver.entities.User1;

public interface UserRepository extends JpaRepository<User1, Integer> {



}
