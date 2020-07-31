package com.ray.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private String accountNumber;

    public User(String email) {
        this.accountNumber = email;
    }

}
