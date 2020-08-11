package com.org.JPARecap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.org.JPARecap.Entity.User;
import com.org.JPARecap.Service.UserDAOService;

@Component
public class UserDAOCommandLineRunner implements CommandLineRunner  {

	private static final Logger log=LoggerFactory.getLogger(UserDAOCommandLineRunner.class);
	
	@Autowired
	private UserDAOService userDAOService;
	
	@Override
	public void run(String... args) throws Exception {
		User user=new User("Bhaskar Maity","Admin");
		userDAOService.insert(user);
		log.info("New usewr is created");
	}
	

}
