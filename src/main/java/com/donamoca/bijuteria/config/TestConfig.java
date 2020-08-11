package com.donamoca.bijuteria.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.donamoca.bijuteria.entities.User;
import com.donamoca.bijuteria.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig  implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@SuppressWarnings("null")
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User((Long) null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		
		User u2 = new User((Long) null, "Alex Green", "alex@gmail.com", "977777777", "123456");
	
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
	
}
