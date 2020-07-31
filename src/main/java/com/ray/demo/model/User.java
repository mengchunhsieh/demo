package com.ray.demo.model;

import lombok.Getter;

@Getter
public class User {

    private String id;

    private String name;

    private String phoneNumber;

    public User(String email, String name, String phoneNumber) {
        this.id = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

}
