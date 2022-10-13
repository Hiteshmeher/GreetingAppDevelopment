package com.bridgelabz.greeting.greetingapp.repository;

import com.bridgelabz.greeting.greetingapp.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository  extends JpaRepository<Greeting, Long> {

}

