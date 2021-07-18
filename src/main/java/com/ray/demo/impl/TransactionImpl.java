package com.ray.demo.impl;

import com.ray.demo.model.TransactionResponse;
import com.ray.demo.service.TransactionGetStrategyFactory;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class TransactionImpl {

    /**
     * The {@link TransactionGetStrategyFactory}.
     */
    @Inject
    TransactionGetStrategyFactory transactionGetStrategyFactory;
    /**
     * To all transaction.
     *
     * @return All Transaction
     * @throws ParseException
     */
    @RequestMapping("/transactions")
    public ResponseEntity<TransactionResponse> getAllTransaction() throws ParseException {
        log.info("API path: /transactions");
        TransactionResponse transactionResponse = transactionGetStrategyFactory.getAllTransaction();
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
        log.info("API path: /transaction/{date}");
        TransactionResponse transactionResponse = transactionGetStrategyFactory.getTransactionByDate(date);
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
        log.info("API path: /transactionsIdDate/{id}/{date}");
        TransactionResponse transactionResponse = transactionGetStrategyFactory.getTransactionByIdAndDate(id, date);
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
        log.info("API path: /transactionsIdType/{id}/{type}");
        TransactionResponse transactionResponse = transactionGetStrategyFactory.getTransactionByIdAndType(id, type);
        //TODO: verify data to return different Http Status
        return new ResponseEntity<TransactionResponse>(transactionResponse, HttpStatus.OK);
    }
}
