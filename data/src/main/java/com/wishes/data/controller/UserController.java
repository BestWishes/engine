package com.wishes.data.controller;

import com.wishes.data.entity.User;
import com.wishes.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/save")
    public String save(User user) {

        userRepository.save(user);

        return "success !";

    }

}
