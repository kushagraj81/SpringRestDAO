package com.db.databaseDemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

@SpringBootApplication
public class DatabaseDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(String args[])
	{
		return runner->{
			System.out.println("Hello Kushagra");
		};
	}
}
