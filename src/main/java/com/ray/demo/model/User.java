package com.ray.demo.model;

import lombok.Getter;

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
     * Constructor of User
     *
     * @param email id
     * @param name user name
     * @param phoneNumber user phone number
     */
    public User(String email, String name, String phoneNumber) {
        this.id = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

}
