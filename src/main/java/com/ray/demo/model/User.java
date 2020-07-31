package com.ray.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class User {

    private String accountNumber;

    private String name;

    private String phoneNumber;

    public User(String email, String name, String phoneNumber) {
        this.accountNumber = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

}
