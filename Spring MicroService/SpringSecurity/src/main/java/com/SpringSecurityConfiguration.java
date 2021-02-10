package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	/*@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		// TODO Auto-generated method stub
		System.out.println("Method came");
		List<UserDetails> listOfUser = new ArrayList<>();
		//listOfUser.add(User.withUsername("Ajay").password("123").roles("USER_ROLE").build());
		listOfUser.add(User.withDefaultPasswordEncoder().username("Ajay").password("123").roles("USER_ROLE").build());
		listOfUser.add(User.withDefaultPasswordEncoder().username("Vikash").password("567").roles("USER_ROLE").build());
		listOfUser.add(User.withDefaultPasswordEncoder().username("Ramesh").password("789").roles("USER_ROLE").build());
		return new InMemoryUserDetailsManager(listOfUser);
	}
	*/
	
	private final static String ADMIN="ADMIN_ROLE";
	private final static String USER="USER_ROLE";
	
	@Bean
	public PasswordEncoder password() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Ajay").password(password().encode("123")).roles(USER);
		auth.inMemoryAuthentication().withUser("Vikah").password(password().encode("567")).roles(USER);
		auth.inMemoryAuthentication().withUser("Ramesh").password(password().encode("789")).roles(USER);
		auth.inMemoryAuthentication().withUser("Admin").password(password().encode("admin")).roles(ADMIN);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests()
		.antMatchers("/auth/user").hasAnyRole(USER,ADMIN)
		.antMatchers("/auth/admin").hasAnyRole(ADMIN)
		.antMatchers("/noauth/**").permitAll()
		.and()
		.formLogin();
	}
	
	
}
