package com.bridgelabz.greeting.greetingapp.service;

import com.bridgelabz.greeting.greetingapp.entity.Greeting;
import com.bridgelabz.greeting.greetingapp.entity.User;

import java.util.List;

public interface IGreetingService {
    String getGreetingMessage();
    String getGreetingMessage(User user);
    Greeting addGreetingMessage(User user);
    Greeting getGreetingMsgById(long id);
    List<Greeting> getAllGreetingMsg();
}
