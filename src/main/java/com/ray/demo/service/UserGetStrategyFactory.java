package com.ray.demo.service;

import com.ray.demo.model.UserResponse;
import org.springframework.stereotype.Service;
import javax.inject.Inject;

/**
 * Service layer for user get functions
 */
@Service
public class UserGetStrategyFactory {

    /**
     * The {@link UserGetStrategy }.
     */
    @Inject
    UserGetStrategy userGetStrategy;


    /**
     * To get all Users
     *
     * @return all transaction
     */
    public UserResponse getAllUserInfo() {
        return userGetStrategy.processAllUserInfo();
    }

    /**
     * To get user by Id
     *
     * @param id user id a.k.a user email
     * @return response of selected user
     */
    public UserResponse getUserById(String id) {
        return userGetStrategy.getUserById(id);
    }
}