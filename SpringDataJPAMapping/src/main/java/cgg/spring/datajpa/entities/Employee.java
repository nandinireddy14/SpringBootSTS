package cgg.spring.datajpa.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "emp")
public class Employee {
	@Id
	private int eid;
	private String ename;
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	
	private List<Project> projects=new ArrayList<>();

}
