package com.ray.demo.service;

import com.ray.demo.model.Transaction;
import com.ray.demo.model.UserResponse;
import com.ray.demo.model.User;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
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
    public UserResponse processAllUserInfo() throws ParseException {
        UserResponse response = new UserResponse();
        //User0
        List<Transaction> user0TransactionList = new ArrayList<>();

        Transaction transaction0 = new Transaction("user0","0001", "type0","user0_Billing","user0_Sub",
                                   new SimpleDateFormat("yyyy-mm-dd-hh").parse("2020-01-02-00"));

        user0TransactionList.add(transaction0);

        response.setUser(new User("user0@gmail.com", "User0", "0000000000", user0TransactionList));

        //User1
        List<Transaction> user1TransactionList = new ArrayList<>();

        Transaction transaction1 = new Transaction("user1", "0101","type0","user1_Billing", "user1_Sub",
                                   new SimpleDateFormat("yyyy-mm-dd-hh").parse("2020-01-02-02"));

        Transaction transaction2 = new Transaction("user1", "0102", "type1","user1_Billing", "user1_Sub",
                                   new SimpleDateFormat("yyyy-mm-dd-hh").parse("2020-01-03-00"));

        user1TransactionList.add(transaction1);
        user1TransactionList.add(transaction2);

        response.setUser(new User("user1@gmail.com", "User1", "1111111111", user1TransactionList));

        //User2
        List<Transaction> user2TransactionList = new ArrayList<>();

        Transaction transaction3 = new Transaction("user2", "0201", "type1","user2_Billing", "user2_Sub",
                                   new SimpleDateFormat("yyyy-mm-dd-hh").parse("2020-01-01-00"));

        Transaction transaction4 = new Transaction("user2", "0202", "type2","user2_Billing", "user2_Sub",
                                   new SimpleDateFormat("yyyy-mm-dd-hh").parse("2020-01-03-01"));

        Transaction transaction5 = new Transaction("user2", "0203","type1","user2_Billing", "user2_Sub",
                                   new SimpleDateFormat("yyyy-mm-dd-hh").parse("2020-01-03-01"));

        user2TransactionList.add(transaction3);
        user2TransactionList.add(transaction4);
        user2TransactionList.add(transaction5);

        response.setUser(new User("user2@gmail.com", "User2", "2222222222", user2TransactionList));

        //User3
        List<Transaction> user3TransactionList = new ArrayList<>();

        Transaction transaction6 = new Transaction("user3", "0301","type0","user3_Billing", "user3_Sub",
                                   new SimpleDateFormat("yyyy-mm-dd-hh").parse("2020-01-02-02"));

        Transaction transaction7 = new Transaction("user3", "0302","type1","user3_Billing", "user3_Sub",
                                   new SimpleDateFormat("yyyy-mm-dd-hh").parse("2020-01-03-01"));

        user3TransactionList.add(transaction6);
        user3TransactionList.add(transaction7);

        response.setUser(new User("user3@gmail.com", "User3", "3333333333", user3TransactionList));

        return response;
    }

    /**
     * To get user by Id
     * @param id user id a.k.a user email
     * @return response of selected user
     */
    public UserResponse getUserById(String id) throws ParseException {
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
    public User filterUsers(Predicate<User> strategy) throws ParseException {
        return processAllUserInfo().getUserList().stream().filter(strategy).findFirst().orElse(null);
    }

}