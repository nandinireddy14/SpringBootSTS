package cgg.spring.datajpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Data;
import lombok.Data;
import lombok.Data;
import lombok.Data;
import lombok.Data;

@Data
@Entity
public class UserOne {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String city;
	private String status;
}
