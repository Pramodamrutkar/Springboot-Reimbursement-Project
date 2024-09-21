package com.reimbursement.rmiproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
@SpringBootApplication
public class RmiprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RmiprojectApplication.class, args);
	}

}
