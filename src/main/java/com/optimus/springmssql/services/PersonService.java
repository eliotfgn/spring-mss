package com.optimus.springmssql.services;

import com.optimus.springmssql.domain.Person;
import com.optimus.springmssql.repositories.PersonRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class PersonService {
    private final PersonRepository personRepository;

    public void create() {
        Person person = new Person();
        person.setName("Eliot");
        personRepository.save(person);
    }

    public void get() {
        List<Person> persons = personRepository.findAll();
        log.info("List:");
        for (Person person : persons) {
            log.info(person.getName());
        }
    }
}
