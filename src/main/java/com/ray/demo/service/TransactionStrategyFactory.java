package com.ray.demo.service;

import com.ray.demo.model.Transaction;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class TransactionStrategyFactory {

    @Inject
    TransactionStrategy transactionStrategy;

    @RequestMapping("/transaction/{date}")
    public List<Transaction> getTransactionByDate(@PathVariable("date") String date) throws ParseException {
        Date targetDate = new SimpleDateFormat("yyyy-mm-dd").parse(date);

        return transactionStrategy.getTransactionByDate(targetDate);
    }

    @RequestMapping("/transactions")
    public List<Transaction> getAllTransaction() throws ParseException {
        return transactionStrategy.processAllTransaction();
    }

    @RequestMapping("/transactionsIdDate/{id}/{date}")
    public List<Transaction> getTransactionByIdAndDate(@PathVariable("id") String id,
                                                       @PathVariable("date") String date) throws ParseException{
        Date targetDate = new SimpleDateFormat("yyyy-mm-dd").parse(date);
        return transactionStrategy.getTransactionByIdAndDate(id, targetDate);
    }
}
