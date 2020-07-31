package com.ray.demo.service;

import com.ray.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class UserFactory {

    public List<User> processAllUserInfo() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("demoUser0@gmail.com"));
        userList.add(new User("demoUser1@gmail.com"));
        userList.add(new User("demoUser2@gmail.com"));
        userList.add(new User("demoUser3@gmail.com"));

        return userList;
    }


    public User getUserByAccountNumber(String accountNumber) {
        Predicate<User> byAccountNum = u -> u.getAccountNumber().equals(accountNumber);
        return filterUsers(byAccountNum);
    }

    public User filterUsers(Predicate<User> strategy) {
        return processAllUserInfo().stream().filter(strategy).findFirst().orElse(null);
    }

}
