package com.ray.demo.impl;

import com.ray.demo.model.UserResponse;
import com.ray.demo.service.UserGetStrategyFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class UserImpl {

    @Inject
    UserGetStrategyFactory userGetStrategyFactory;

    @RequestMapping("/users")
    public UserResponse getAllUserInfo() {
        return userGetStrategyFactory.getAllUserInfo();
    }

    @RequestMapping("/user/{id}")
    public UserResponse getUserById(@PathVariable("id") String id) {
        return userGetStrategyFactory.getUserById(id);
    }

}
