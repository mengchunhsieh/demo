package com.ray.demo.model;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Response for User functions
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({ "user"})
public class UserResponse {

    /**
     * list of user for response
     */
    @JsonProperty("user")
    @JsonPropertyDescription("user response")
    private List<User> userList = new ArrayList<>();

    /**
     * setter for user list
     * @param user
     */
    @JsonProperty("user")
    public void setUser(User user) {
        this.userList.add(user);
    }

    /**
     * getter for user list
     * @return user list
     */
    @JsonProperty("user")
    public List<User> getUserList() {
        return this.userList;
    }


//    /**
//     * list of transaction for response
//     */
//    @JsonProperty("transaction")
//    @JsonPropertyDescription("transaction response")
//    private List<Transaction> transactionList = new ArrayList<>();
//
//    /**
//     * setter for transaction list
//     * @param transaction
//     */
//    @JsonProperty("transaction")
//    public void setTransaction(Transaction transaction) {
//        this.transactionList.add(transaction);
//    }
//
//    /**
//     * setter for transaction list
//     * @param transaction
//     */
//    @JsonProperty("transaction")
//    public void setTransaction(List<Transaction> transaction) {
//        this.transactionList = transaction;
//    }
//
//    /**
//     * getter for transaction list
//     * @return
//     */
//    @JsonProperty("transaction")
//    public List<Transaction> getTransactionList() {
//        return this.transactionList;
//    }
}
