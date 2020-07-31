package com.ray.demo.model;

import lombok.Getter;

import java.util.Date;

@Getter
public class Transaction {

    private String accountNumber;

    private String billing;

    private String subscriptions;

    private Date date;

    public Transaction (String email, String billing, String subscriptions, Date date) {
        this.accountNumber = email;
        this.billing = billing;
        this.subscriptions = subscriptions;
        this.date = date;

    }

}
