package com.ray.demo.model;

import lombok.Getter;

import javax.persistence.*;

import java.util.List;

/**
 * Model of User
 */
@Entity
@Table(name = "users")
@Getter
public class User {

    /**
     * User Id, same as email
     * @Id: as prime key in DB
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    /**
     * User name
     */
    @Column(name = "name")
    private String name;

    /**
     * User phone number
     */
    @Column(name = "phoneNumber")
    private String phoneNumber;

    /**
     * List of transaction own by user
     */
    @Column(name = "transactionList")
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
