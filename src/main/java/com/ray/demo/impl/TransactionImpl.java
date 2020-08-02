package com.ray.demo.impl;

import com.ray.demo.model.TransactionResponse;
import com.ray.demo.model.UserResponse;
import com.ray.demo.service.TransactionStrategyFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.text.ParseException;

/**
 * Implementation for Transaction Controllers
 */
@RestController
public class TransactionImpl {

    /**
     * The {@link TransactionStrategyFactory}.
     */
    @Inject
    TransactionStrategyFactory transactionStrategyFactory;
    /**
     * To all transaction.
     *
     * @return All Transaction
     * @throws ParseException
     */
    @RequestMapping("/transactions")
    public ResponseEntity<TransactionResponse> getAllTransaction() throws ParseException {
        TransactionResponse transactionResponse = transactionStrategyFactory.getAllTransaction();
        //TODO: verify data to return different Http Status
        return new ResponseEntity<TransactionResponse>(transactionResponse, HttpStatus.OK);
    }

    /**
     * To get target transactions that is selected by Date.
     *
     * @param date Input Date
     * @return Transaction Response that is get by Date
     * @throws ParseException
     */
    @RequestMapping("/transaction/{date}")
    public ResponseEntity<TransactionResponse> getTransactionByDate(@PathVariable("date") String date) throws ParseException {
        TransactionResponse transactionResponse = transactionStrategyFactory.getTransactionByDate(date);
        //TODO: verify data to return different Http Status
        return new ResponseEntity<TransactionResponse>(transactionResponse, HttpStatus.OK);
    }

    /**
     * To get target transactions that is selected by Id and Date.
     *
     * @param id
     * @param date
     * @return Transactions that is selected by Id and Date
     * @throws ParseException
     */
    @RequestMapping("/transactionsIdDate/{id}/{date}")
    public ResponseEntity<TransactionResponse> getTransactionByIdAndDate(@PathVariable("id") String id,
                                                         @PathVariable("date") String date) throws ParseException{
        TransactionResponse transactionResponse = transactionStrategyFactory.getTransactionByIdAndDate(id, date);
        //TODO: verify data to return different Http Status
        return new ResponseEntity<TransactionResponse>(transactionResponse, HttpStatus.OK);
    }

    /**
     * To get target transactions that is selected by Id and Type.
     *
     * @param id
     * @param type
     * @return Transactions that is selected by Id and Type
     * @throws ParseException
     */
    @RequestMapping("/transactionsIdType/{id}/{type}")
    public ResponseEntity<TransactionResponse> getTransactionByIdAndType(@PathVariable("id") String id,
                                                         @PathVariable("type") String type) throws ParseException{
        TransactionResponse transactionResponse = transactionStrategyFactory.getTransactionByIdAndType(id, type);
        //TODO: verify data to return different Http Status
        return new ResponseEntity<TransactionResponse>(transactionResponse, HttpStatus.OK);
    }
}
