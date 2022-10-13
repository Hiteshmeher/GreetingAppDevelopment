package com.bridgelabz.greeting.greetingapp.service;

import com.bridgelabz.greeting.greetingapp.entity.Greeting;
import com.bridgelabz.greeting.greetingapp.entity.User;

public interface IGreetingService {
    String getGreetingMessage();
    String getGreetingMessage(User user);
    Greeting addGreetingMessage(User user);

}
