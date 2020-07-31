package com.ray.demo.service;

import com.ray.demo.model.Transaction;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class TransactionFactory {

    public List<Transaction> processAllTransaction() throws ParseException {
        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(new Transaction("user0","user0_Billing","user0_Sub",
                            new SimpleDateFormat("yyyy-mm-dd").parse("2020-01-02")));

        transactionList.add(new Transaction("user1", "user1_Billing", "user1_Sub",
                            new SimpleDateFormat("yyyy-mm-dd").parse("2020-01-02")));

        transactionList.add(new Transaction("user1", "user1_Billing", "user1_Sub",
                            new SimpleDateFormat("yyyy-mm-dd").parse("2020-01-03")));

        transactionList.add(new Transaction("user2", "user2_Billing", "user2_Sub",
                            new SimpleDateFormat("yyyy-mm-dd").parse("2020-01-01")));

        transactionList.add(new Transaction("user3", "user3_Billing", "user3_Sub",
                            new SimpleDateFormat("yyyy-mm-dd").parse("2020-01-02")));

        transactionList.add(new Transaction("user3", "user3_Billing", "user3_Sub",
                            new SimpleDateFormat("yyyy-mm-dd").parse("2020-01-03")));

        return transactionList;
    }

    public List<Transaction> getTransactionByDate(Date date) throws ParseException {
        Predicate<Transaction> byDate = t -> t.getDate().equals(date);
        return filterTransaction(byDate);
    }

    public List<Transaction> filterTransaction(Predicate<Transaction> strategy) throws ParseException {
        return processAllTransaction().stream().filter(strategy).collect(Collectors.toList());
    }
}
