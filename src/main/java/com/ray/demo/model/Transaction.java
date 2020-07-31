package com.ray.demo.model;

import lombok.Getter;
import java.util.Date;

@Getter
public class Transaction {

    private String id;

    private String transactionId;

    private String billing;

    private String subscriptions;

    private Date date;

    public Transaction (String email, String transactionId, String billing, String subscriptions, Date date) {
        this.id = email;
        this.transactionId = transactionId;
        this.billing = billing;
        this.subscriptions = subscriptions;
        this.date = date;
    }


}
