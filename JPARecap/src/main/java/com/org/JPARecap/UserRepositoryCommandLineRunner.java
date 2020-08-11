package com.org.JPARecap;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.org.JPARecap.Entity.User;
import com.org.JPARecap.Service.UserDAOService;
import com.org.JPARecap.Service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner  {

	private static final Logger log=LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User user=new User("Bhaskar Maity","Admin");
		//userDAOService.insert(user);
		userRepository.save(user);
		log.info("New user is created");
		
		Optional<User> optUser=userRepository.findById(1L);
		log.info("User is retrived");	
		
		List<User> optUser2=userRepository.findAll();
		log.info("Users are retrived");
	}
}
