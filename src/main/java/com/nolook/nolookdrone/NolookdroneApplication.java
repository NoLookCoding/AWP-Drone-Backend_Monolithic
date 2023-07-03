package com.nolook.nolookdrone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class NolookdroneApplication {

	public static void main(String[] args) {
		SpringApplication.run(NolookdroneApplication.class, args);
	}

}
