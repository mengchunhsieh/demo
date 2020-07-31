package com.ray.demo.service;

import com.ray.demo.model.UserResponse;
import com.ray.demo.model.User;
import org.springframework.stereotype.Service;
import java.util.function.Predicate;

@Service
public class UserGetStrategy {

    public UserResponse processAllUserInfo() {
        UserResponse response = new UserResponse();
        response.setUser(new User("user0@gmail.com", "User0", "0000000000"));
        response.setUser(new User("user1@gmail.com", "User1", "1111111111"));
        response.setUser(new User("user2@gmail.com", "User2", "2222222222"));
        response.setUser(new User("user3@gmail.com", "User3", "3333333333"));

        return response;
    }

    public UserResponse getUserById(String id) {
        UserResponse response = new UserResponse();
        Predicate<User> byId = u -> u.getId().equals(id);
        User user = filterUsers(byId);
        response.setUser(user);
        return response;
    }

    public User filterUsers(Predicate<User> strategy) {
        return processAllUserInfo().getUserList().stream().filter(strategy).findFirst().orElse(null);
    }

}