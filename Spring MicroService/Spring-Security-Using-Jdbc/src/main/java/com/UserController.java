package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private JdbcUserDetailsManager jdbcUserDetails;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	@PostMapping(value = "/register-user",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createUser(@RequestBody Users users) {
		System.out.println("Came Here "+users.getUserName());
		List<GrantedAuthority> authority = new ArrayList<>();
		authority.add(new SimpleGrantedAuthority(users.getRoles()));
		String password = passwordEncoder.encode(users.getPassword());
		User userInfo = new User(users.getUserName(), password, authority);
		jdbcUserDetails.createUser(userInfo);
		return "User Created successfully";
	}
	
	@GetMapping(value="user")
	public String getUser() {
		return "Welcome User";
	}
	
	@GetMapping(value="admin")
	public String getAdmin() {
		return "Welcome Admin";
	}
	
	@GetMapping(value="all")
	public String getAll() {
		return "Welcome anyone";
	}
	
}
