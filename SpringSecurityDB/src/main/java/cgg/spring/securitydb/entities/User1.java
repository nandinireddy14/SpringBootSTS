package cgg.spring.securitydb.entities;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="users")
@AllArgsConstructor
@NoArgsConstructor
public class User1 {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String username;
	private String password;
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Role role;
	
}
