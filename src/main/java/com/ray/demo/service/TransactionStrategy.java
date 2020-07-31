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
public class TransactionStrategy {

    public List<Transaction> processAllTransaction() throws ParseException {
        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(new Transaction("user0", "0001","user0_Billing","user0_Sub",
                            new SimpleDateFormat("yyyy-mm-dd").parse("2020-01-02")));

        transactionList.add(new Transaction("user1", "0101","user1_Billing", "user1_Sub",
                            new SimpleDateFormat("yyyy-mm-dd").parse("2020-01-02")));

        transactionList.add(new Transaction("user1", "0102", "user1_Billing", "user1_Sub",
                            new SimpleDateFormat("yyyy-mm-dd").parse("2020-01-03")));

        transactionList.add(new Transaction("user2", "0201", "user2_Billing", "user2_Sub",
                            new SimpleDateFormat("yyyy-mm-dd").parse("2020-01-01")));

        transactionList.add(new Transaction("user2", "0202", "user2_Billing", "user2_Sub",
                            new SimpleDateFormat("yyyy-mm-dd").parse("2020-01-03")));

        transactionList.add(new Transaction("user2", "0203","user2_Billing", "user2_Sub",
                            new SimpleDateFormat("yyyy-mm-dd").parse("2020-01-03")));

        transactionList.add(new Transaction("user3", "0301","user3_Billing", "user3_Sub",
                            new SimpleDateFormat("yyyy-mm-dd").parse("2020-01-02")));

        transactionList.add(new Transaction("user3", "0302","user3_Billing", "user3_Sub",
                            new SimpleDateFormat("yyyy-mm-dd").parse("2020-01-03")));

        return transactionList;
    }

    public List<Transaction> getTransactionByDate(Date date) throws ParseException {
        Predicate<Transaction> byDate = t -> t.getDate().equals(date);
        return dateFilterTransaction(byDate);
    }

    public List<Transaction> dateFilterTransaction(Predicate<Transaction> strategy) throws ParseException {
        return processAllTransaction().stream().filter(strategy).collect(Collectors.toList());
    }

    public List<Transaction> getTransactionByIdAndDate(String id, Date date) throws ParseException {
        Predicate<Transaction> byId = t -> t.getId().equals(id);
        Predicate<Transaction> byDate = t -> t.getDate().equals(date);
        return idAndDatefilterTransaction(byDate, byId);
    }

    public List<Transaction> idAndDatefilterTransaction(Predicate<Transaction> dateStrategy,
                                                        Predicate<Transaction> idStrategy) throws ParseException {
        return processAllTransaction().stream().filter(dateStrategy).filter(idStrategy).collect(Collectors.toList());
    }
}
