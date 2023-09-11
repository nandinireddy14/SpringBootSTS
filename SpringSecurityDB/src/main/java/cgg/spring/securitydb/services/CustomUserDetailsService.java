package cgg.spring.securitydb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cgg.spring.securitydb.dao.UserRepository;
import cgg.spring.securitydb.entities.CustomUserDetails;
import cgg.spring.securitydb.entities.User1;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User1 user = userRepo.findByUsername(username);
		
		if(user==null) {
			throw new UsernameNotFoundException("No user");
		}
		return new CustomUserDetails(user);
	}

	
}
