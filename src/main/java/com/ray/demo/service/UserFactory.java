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
        userList.add(new User("user0@gmail.com", "User0", "0000000000"));
        userList.add(new User("user1@gmail.com", "User1", "1111111111"));
        userList.add(new User("user2@gmail.com", "User2", "2222222222"));
        userList.add(new User("user3@gmail.com", "User3", "3333333333"));

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
