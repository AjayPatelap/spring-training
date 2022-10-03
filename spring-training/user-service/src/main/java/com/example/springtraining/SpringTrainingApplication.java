package com.example.springtraining;

import com.example.springtraining.model.User;
import com.example.springtraining.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTrainingApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(SpringTrainingApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setUserName("Raj");
		user.setUserPhoneNo("9713664700");
		user.setUserAddress("127/10 near xyz MP");
		user.setUserEmail("raj@gmail.com");
		user.setPassword("123456");
		userRepository.save(user);

		User user1 = new User();
		user1.setUserName("aman");
		user1.setUserPhoneNo("9713564700");
		user1.setUserAddress("130/10 near aman MP");
		user1.setUserEmail("aman@gmail.com");
		user1.setPassword("123456");
		userRepository.save(user1);
	}
}
