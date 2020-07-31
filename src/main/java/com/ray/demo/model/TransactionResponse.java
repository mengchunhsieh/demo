package com.ray.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({ "transaction" })
public class TransactionResponse {

    @JsonProperty("transaction")
    @JsonPropertyDescription("transaction response")
    private List<Transaction> transactionList = new ArrayList<>();

    @JsonProperty("transaction")
    public void setTransaction(Transaction transaction) {
        this.transactionList.add(transaction);
    }

    @JsonProperty("transaction")
    public void setTransaction(List<Transaction> transaction) {
        this.transactionList = transaction;
    }

    @JsonProperty("transaction")
    public List<Transaction> getTransactionList() {
        return this.transactionList;
    }
}
