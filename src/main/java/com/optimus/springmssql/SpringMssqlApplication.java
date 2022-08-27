package com.optimus.springmssql;

import com.optimus.springmssql.domain.Person;
import com.optimus.springmssql.repositories.PersonRepository;
import com.optimus.springmssql.services.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class SpringMssqlApplication implements CommandLineRunner {
	private final PersonService personService;

	public static void main(String[] args) {

		SpringApplication.run(SpringMssqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		personService.create();
		personService.get();
	}
}
