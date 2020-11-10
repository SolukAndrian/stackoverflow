package com.example.stackoverflow;

import com.example.stackoverflow.config.ApplicationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements ApplicationRunner {

	@Autowired
	private ApplicationProperties applicationProperties;

	@Override
	public void run(final ApplicationArguments args) {
		System.out.println("Test config: "+ applicationProperties.getPath());
	}

	public static void main(String[] args) {
		System.out.println();
		SpringApplication.run(Application.class, args);
	}

}
