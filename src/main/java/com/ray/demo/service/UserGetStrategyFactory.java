package com.ray.demo.service;

import com.ray.demo.model.DemoResponse;
import com.ray.demo.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.inject.Inject;


import java.util.List;

@RestController
public class UserGetStrategyFactory {

    @Inject
    UserGetStrategy userGetStrategy;

    @RequestMapping("/users")
    public List<User> getAllUserInfo() {
        return userGetStrategy.processAllUserInfo();
    }

    @RequestMapping("/user/{acoountNumber}")
    public User getUserByAccountNumber(@PathVariable("acoountNumber") String accountNumber) {
        return userGetStrategy.getUserById(accountNumber);
    }
}


/*
package com.ray.demo.service;

import com.ray.demo.model.DemoResponse;
import com.ray.demo.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.inject.Inject;


import java.util.List;

//@RestController
@Service
public class UserGetStrategyFactory {

    @Inject
    UserGetStrategy userGetStrategy;

//    @RequestMapping("/users")
    public List<User> getAllUserInfo() {
        return userGetStrategy.processAllUserInfo();
    }

//    @RequestMapping("/user/{id}")
//    public DemoResponse getUserById(@PathVariable("id") String id) {
    public DemoResponse getUserById(String id) {
        return userGetStrategy.getUserById(id);
    }

}

 */
