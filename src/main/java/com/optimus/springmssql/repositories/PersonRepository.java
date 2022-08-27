package com.optimus.springmssql.repositories;

import com.optimus.springmssql.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
