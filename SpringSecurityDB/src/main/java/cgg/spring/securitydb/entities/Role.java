package cgg.spring.securitydb.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="roles")
@Data
@AllArgsConstructor
public class Role {



	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int roleId;
	

	private String roleName;
	
}
