package com.ray.demo.model;

import lombok.Getter;
import java.util.Date;

/**
 * Model of Transaction
 */
@Getter
public class Transaction {

    /**
     * User ID, it same as email
     */
    private String id;

    /**
     * The unique id for transaction
     */
    private String transactionId;

    /**
     * Type of the transaction
     */
    private String type;

    /**
     * Billing of the transaction
     */
    private String billing;

    /**
     * Subscriptions of the transaction
     */
    private String subscriptions;

    /**
     * Date of the transaction
     */
    private Date date;

    /**
     * Constructor for Transaction
     *
     * @param email Id
     * @param transactionId transaction id
     * @param type type
     * @param billing billing
     * @param subscriptions subscription
     * @param date date
     */
    public Transaction (String email, String transactionId, String type, String billing, String subscriptions, Date date) {
        this.id = email;
        this.type = type;
        this.transactionId = transactionId;
        this.billing = billing;
        this.subscriptions = subscriptions;
        this.date = date;
    }
}
