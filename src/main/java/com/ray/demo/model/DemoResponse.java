package com.ray.demo.model;


import com.fasterxml.jackson.annotation.*;

import java.util.List;

//@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({ "user", "transaction" })
public class DemoResponse {

    @JsonProperty("user")
    @JsonPropertyDescription("user response")
    private List<User> userList;

    @JsonProperty("user")
    public void setUser(User user) {
        System.out.println(user.toString());
        this.userList.add(user);
    }

    @JsonProperty("user")
    public List<User> getUserList() {
        return this.userList;
    }

    @JsonProperty("transaction")
    @JsonPropertyDescription("transaction response")
    private List<Transaction> transactionList;

    @JsonProperty("transaction")
    public void setTransaction(Transaction transaction) {
        this.transactionList.add(transaction);
    }

    @JsonProperty("transaction")
    public List<Transaction> getTransactionList() {
        return this.transactionList;
    }

}
