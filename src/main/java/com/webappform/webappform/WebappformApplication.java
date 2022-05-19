package com.webappform.webappform;

import com.webappform.webappform.Repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class WebappformApplication implements CommandLineRunner{

	@Autowired
    UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(WebappformApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.findAll();
		// TODO Auto-generated method stub
	}

}
