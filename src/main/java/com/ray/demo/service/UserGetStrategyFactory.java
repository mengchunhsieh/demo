package com.ray.demo.service;

import com.ray.demo.model.UserResponse;
import org.springframework.stereotype.Service;
import javax.inject.Inject;

@Service
public class UserGetStrategyFactory {

    @Inject
    UserGetStrategy userGetStrategy;

    public UserResponse getAllUserInfo() {
        return userGetStrategy.processAllUserInfo();
    }

    public UserResponse getUserById(String id) {
        return userGetStrategy.getUserById(id);
    }
}