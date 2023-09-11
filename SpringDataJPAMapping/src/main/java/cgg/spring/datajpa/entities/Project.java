package cgg.spring.datajpa.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "proj")
public class Project {
	@Id
	private int pid;
	private String pname;
	@ManyToMany(mappedBy="projects")
	
	private List<Employee> employees=new ArrayList<>();
}
