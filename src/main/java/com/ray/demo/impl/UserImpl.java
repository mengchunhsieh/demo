package com.ray.demo.impl;

import com.ray.demo.model.UserResponse;
import com.ray.demo.service.TransactionGetStrategyFactory;
import com.ray.demo.service.UserGetStrategyFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.text.ParseException;

/**
 * Implementation for User controller
 */
@RestController
@Slf4j
public class UserImpl {

    /**
     * The {@link TransactionGetStrategyFactory}.
     */
    @Inject
    UserGetStrategyFactory userGetStrategyFactory;

    /**
     * To get all users
     *
     * @return aLL users
     */
    @RequestMapping("/users")
    public ResponseEntity<UserResponse> getAllUserInfo() throws ParseException {
        UserResponse userResponse = userGetStrategyFactory.getAllUserInfo();
        log.info("API path: /users");
        //TODO: verify data to return different Http Status
        return new ResponseEntity<UserResponse>(userResponse,HttpStatus.OK);
    }

    /**
     * To get selected Id of user
     *
     * @param id
     * @return select user
     */
    @RequestMapping("/user/{id}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable("id") String id) throws ParseException {
        log.info("API path: /user/{id}");
        UserResponse userResponse = userGetStrategyFactory.getUserById(id);
        //TODO: verify data to return different Http Status
        return new ResponseEntity<UserResponse>(userResponse,HttpStatus.OK);
    }

}
