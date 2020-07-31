package com.ray.demo.service;

import com.ray.demo.model.UserResponse;
import com.ray.demo.model.User;
import org.springframework.stereotype.Service;
import java.util.function.Predicate;


/**
 * Service layer for User Functions
 */
@Service
public class UserGetStrategy {

    /**
     * To get all Users
     * TODO: Query Data Base if there is any.
     *
     * @return all transaction
     */
    public UserResponse processAllUserInfo() {
        UserResponse response = new UserResponse();
        response.setUser(new User("user0@gmail.com", "User0", "0000000000"));
        response.setUser(new User("user1@gmail.com", "User1", "1111111111"));
        response.setUser(new User("user2@gmail.com", "User2", "2222222222"));
        response.setUser(new User("user3@gmail.com", "User3", "3333333333"));

        return response;
    }

    /**
     * To get user by Id
     * @param id user id a.k.a user email
     * @return response of selected user
     */
    public UserResponse getUserById(String id) {
        UserResponse response = new UserResponse();
        Predicate<User> byId = u -> u.getId().equals(id);
        User user = filterUsers(byId);
        response.setUser(user);
        return response;
    }

    /**
     * Filter for Id
     * @param strategy strategy for user id
     * @return selected user
     */
    public User filterUsers(Predicate<User> strategy) {
        return processAllUserInfo().getUserList().stream().filter(strategy).findFirst().orElse(null);
    }

}