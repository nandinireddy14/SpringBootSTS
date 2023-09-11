package cgg.spring.datajpa.dao;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import cgg.spring.datajpa.entities.UserOne;

public interface UserRepository extends CrudRepository<UserOne,Integer>{
List<UserOne> findByName(String name);
List<UserOne> findByNameAndCity(String name,String city);
List<UserOne> findByStatusContaining(String word);
List<UserOne> findByStatusLike(String pattern);
@Query("select u from UserOne u")
List<UserOne>getAllUsers();
@Query("select u from UserOne u where u.name=:n")
List<UserOne>getUsersByName(@Param("n") String name);
@Query("select u from UserOne u where u.name=:n and u.city=:c")
List<UserOne>getUsersByName(@Param("n") String name,@Param("c") String city);

@Query(value="select * from user_one",nativeQuery=true)
List<UserOne>getUsers();

@Query(value="select * from user_one where city=:c",nativeQuery=true)
List<UserOne> getUsersByCity(@Param("c") String city);
}
