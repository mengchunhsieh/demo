package com.ray.demo.service;

import com.ray.demo.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class TransactionStrategy {

    @Autowired
    TransactionFactory transactionFactory;

    @RequestMapping("/transaction/{date}")
    public List<Transaction> getTransactionByDate(@PathVariable("date") String date) throws ParseException {
        Date targetDate = new SimpleDateFormat("yyyy-mm-dd").parse(date);

        return transactionFactory.getTransactionByDate(targetDate);
    }

    @RequestMapping("/transactions")
    public List<Transaction> getAllTransaction() throws ParseException {
        return transactionFactory.processAllTransaction();
    }
}
