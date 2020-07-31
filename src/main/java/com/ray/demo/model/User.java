package com.ray.demo.model;

import lombok.Getter;

import java.util.List;

/**
 * Model of User
 */
@Getter
public class User {

    /**
     * User Id, same as email
     */
    private String id;

    /**
     * User name
     */
    private String name;

    /**
     * User phone number
     */
    private String phoneNumber;

    /**
     * List of transaction own by user
     */
    private List<Transaction> transactionList;

    /**
     * Constructor of User
     *
     * @param email id
     * @param name user name
     * @param phoneNumber user phone number
     */
    public User(String email, String name, String phoneNumber, List<Transaction> transactionList) {
        this.id = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.transactionList = transactionList;
    }

}
