package com.ray.demo.impl;

import com.ray.demo.model.UserResponse;
import com.ray.demo.service.TransactionStrategyFactory;
import com.ray.demo.service.UserGetStrategyFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.text.ParseException;

/**
 * Implementation for User controller
 */
@RestController
public class UserImpl {

    /**
     * The {@link TransactionStrategyFactory}.
     */
    @Inject
    UserGetStrategyFactory userGetStrategyFactory;

    /**
     * To get all users
     *
     * @return aLL users
     */
    @RequestMapping("/users")
    public UserResponse getAllUserInfo() throws ParseException {
        return userGetStrategyFactory.getAllUserInfo();
    }

    /**
     * To get selected Id of user
     *
     * @param id
     * @return select user
     */
    @RequestMapping("/user/{id}")
    public UserResponse getUserById(@PathVariable("id") String id) throws ParseException {
        return userGetStrategyFactory.getUserById(id);
    }

}
