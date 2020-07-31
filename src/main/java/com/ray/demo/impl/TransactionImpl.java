package com.ray.demo.impl;

import com.ray.demo.model.TransactionResponse;
import com.ray.demo.service.TransactionStrategyFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.text.ParseException;


@RestController
public class TransactionImpl {

    @Inject
    TransactionStrategyFactory transactionStrategyFactory;

    @RequestMapping("/transaction/{date}")
    public TransactionResponse getTransactionByDate(@PathVariable("date") String date) throws ParseException {
        return transactionStrategyFactory.getTransactionByDate(date);
    }

    @RequestMapping("/transactions")
    public TransactionResponse getAllTransaction() throws ParseException {
        return transactionStrategyFactory.getAllTransaction();
    }

    @RequestMapping("/transactionsIdDate/{id}/{date}")
    public TransactionResponse getTransactionByIdAndDate(@PathVariable("id") String id,
                                                       @PathVariable("date") String date) throws ParseException{
        return transactionStrategyFactory.getTransactionByIdAndDate(id, date);
    }
}
