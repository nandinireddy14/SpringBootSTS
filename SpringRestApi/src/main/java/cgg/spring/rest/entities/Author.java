package cgg.spring.rest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import jakarta.persistence.OneToOne;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int authorId;
	private String firstName;
	private String lastName;
	private String language;
	
	@OneToOne(mappedBy="author")
	@JsonBackRefernece
	private Book book;
}
