package com.ray.demo.service;

import com.ray.demo.model.TransactionResponse;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class TransactionStrategyFactory {

    @Inject
    TransactionStrategy transactionStrategy;

    public TransactionResponse getTransactionByDate(String date) throws ParseException {
        Date targetDate = new SimpleDateFormat("yyyy-mm-dd").parse(date);
        return transactionStrategy.getTransactionByDate(targetDate);
    }

    public TransactionResponse getAllTransaction() throws ParseException {
        return transactionStrategy.processAllTransaction();
    }

    public TransactionResponse getTransactionByIdAndDate(String id, String date) throws ParseException{
        Date targetDate = new SimpleDateFormat("yyyy-mm-dd").parse(date);
        return transactionStrategy.getTransactionByIdAndDate(id, targetDate);
    }
}
