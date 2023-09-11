package cgg.spring.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cgg.spring.rest.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
