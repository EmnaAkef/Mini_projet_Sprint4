package com.emna.films;

import java.util.Date;
import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.emna.films.entities.Film;
import com.emna.films.entities.Genre;
import com.emna.films.entities.Role;
import com.emna.films.entities.User;
import com.emna.films.service.FilmService;
import com.emna.films.service.UserService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class FilmsApplication  implements CommandLineRunner{

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration; 
	 @Autowired  
	 PasswordEncoder passwordEncoder;
	 
	 @Autowired
	 UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(FilmsApplication.class, args);
	}
	
	 /*@PostConstruct 
	 void init_users() { 
	  //ajouter les rôles 
	  userService.addRole(new Role(null,"ADMIN")); 
	  userService.addRole(new Role(null,"AGENT")); 
	  userService.addRole(new Role(null,"USER")); 
	   
	  //ajouter les users 
	  userService.saveUser(new User(null,"admin","123",true,null)); 
	  userService.saveUser(new User(null,"emna","123",true,null)); 
	  userService.saveUser(new User(null,"user1","123",true,null)); 
	   
	  //ajouter les rôles aux users 
	  userService.addRoleToUser("admin", "ADMIN"); 
	   
	  userService.addRoleToUser("emna", "USER"); 
	  userService.addRoleToUser("emna", "AGENT"); 
	   
	  userService.addRoleToUser("user1", "USER");   
	 }*/

	@Override
	public void run(String... args) throws Exception {
	
		 //System.out.println("Password Encoded BCRYPT :******************** "); 
	       //System.out.println(passwordEncoder.encode("123")); 
		repositoryRestConfiguration.exposeIdsFor(Film.class,Genre.class);
	}
	
	@Bean 
	public ModelMapper modelMapper() 
	{ 
	return new ModelMapper(); 
	} 

}
