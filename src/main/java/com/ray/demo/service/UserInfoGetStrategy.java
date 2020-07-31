package com.ray.demo.service;

import com.ray.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoGetStrategy {

    @Autowired
    UserFactory userFactory;

    @RequestMapping("/users")
    public List<User> getAllUserInfo() {
        return userFactory.processAllUserInfo();
    }

    @RequestMapping("/user/{acoountNumber}")
    public User getUserByAccountNumber(@PathVariable("acoountNumber") String accountNumber) {
        return userFactory.getUserByAccountNumber(accountNumber);
    }

}
