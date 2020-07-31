package com.ray.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

/**
 * Response for Transaction functions
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({ "transaction" })
public class TransactionResponse {

    /**
     * list of transaction for response
     */
    @JsonProperty("transaction")
    @JsonPropertyDescription("transaction response")
    private List<Transaction> transactionList = new ArrayList<>();

    /**
     * setter for transaction list
     * @param transaction
     */
    @JsonProperty("transaction")
    public void setTransaction(Transaction transaction) {
        this.transactionList.add(transaction);
    }

    /**
     * setter for transaction list
     * @param transaction
     */
    @JsonProperty("transaction")
    public void setTransaction(List<Transaction> transaction) {
        this.transactionList = transaction;
    }

    /**
     * getter for transaction list
     * @return
     */
    @JsonProperty("transaction")
    public List<Transaction> getTransactionList() {
        return this.transactionList;
    }
}
