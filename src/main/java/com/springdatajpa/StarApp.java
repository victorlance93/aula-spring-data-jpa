package com.springdatajpa;

import com.springdatajpa.model.User;
import com.springdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StarApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {

        User user = new User();

        user.setName("Victor Lance");
        user.setUsername("VLance93");
        user.setPassword("tambor1478");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
