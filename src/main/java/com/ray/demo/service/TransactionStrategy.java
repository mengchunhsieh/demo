package com.ray.demo.service;

import com.ray.demo.model.Transaction;
import com.ray.demo.model.TransactionResponse;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Service layer for Transaction Functions
 */
@Service
public class TransactionStrategy {

    /**
     * To get all transactions
     * TODO: Query Data Base if there is any.
     *
     * @return all transaction
     * @throws ParseException
     */
    public TransactionResponse processAllTransaction() throws ParseException {
        TransactionResponse response = new TransactionResponse();

        response.setTransaction(new Transaction("user0","0001", "type0","user0_Billing","user0_Sub",
                                new SimpleDateFormat("yyyy-mm-dd").parse("2020-01-02")));

        response.setTransaction(new Transaction("user1", "0101","type0","user1_Billing", "user1_Sub",
                            new SimpleDateFormat("yyyy-mm-dd").parse("2020-01-02")));

        response.setTransaction(new Transaction("user1", "0102", "type1","user1_Billing", "user1_Sub",
                            new SimpleDateFormat("yyyy-mm-dd").parse("2020-01-03")));

        response.setTransaction(new Transaction("user2", "0201", "type1","user2_Billing", "user2_Sub",
                            new SimpleDateFormat("yyyy-mm-dd").parse("2020-01-01")));

        response.setTransaction(new Transaction("user2", "0202", "type2","user2_Billing", "user2_Sub",
                            new SimpleDateFormat("yyyy-mm-dd").parse("2020-01-03")));

        response.setTransaction(new Transaction("user2", "0203","type1","user2_Billing", "user2_Sub",
                            new SimpleDateFormat("yyyy-mm-dd").parse("2020-01-03")));

        response.setTransaction(new Transaction("user3", "0301","type0","user3_Billing", "user3_Sub",
                            new SimpleDateFormat("yyyy-mm-dd").parse("2020-01-02")));

        response.setTransaction(new Transaction("user3", "0302","type1","user3_Billing", "user3_Sub",
                            new SimpleDateFormat("yyyy-mm-dd").parse("2020-01-03")));

        return response;
    }

    /**
     * To get transaction that is selected by Date
     *
     * @param date Date of transaction
     * @return response list of transaction that is selected by Date
     * @throws ParseException
     */
    public TransactionResponse getTransactionByDate(Date date) throws ParseException {
        TransactionResponse response = new TransactionResponse();
        Predicate<Transaction> byDate = t -> t.getDate().equals(date);
        response.setTransaction(dateFilterTransaction(byDate));
        return response;
    }

    /**
     * Filter for Date
     *
     * @param strategy strategy to filter date
     * @return list of transaction that is selected by Date
     * @throws ParseException
     */
    public List<Transaction> dateFilterTransaction(Predicate<Transaction> strategy) throws ParseException {
        return processAllTransaction().getTransactionList().stream().filter(strategy).collect(Collectors.toList());
    }

    /**
     * To get transaction that is selected by Id and Date
     *
     * @param id user id a.k.a user emial
     * @param date date of transaction
     * @return response list of transactions that is selected by Id and Date
     * @throws ParseException
     */
    public TransactionResponse getTransactionByIdAndDate(String id, Date date) throws ParseException {
        TransactionResponse response = new TransactionResponse();
        Predicate<Transaction> byId = t -> t.getId().equals(id);
        Predicate<Transaction> byDate = t -> t.getDate().equals(date);
        response.setTransaction(idAndDatefilterTransaction(byDate, byId));
        return response;
    }

    /**
     * Filter for Id and Date
     *
     * @param dateStrategy strategy to filter date
     * @param idStrategy strategy to filter id
     * @return list of transaction that is selected by Id and Date
     * @throws ParseException
     */
    public List<Transaction> idAndDatefilterTransaction(Predicate<Transaction> dateStrategy,
                                                        Predicate<Transaction> idStrategy) throws ParseException {
        return processAllTransaction().getTransactionList().stream().filter(dateStrategy).filter(idStrategy).collect(Collectors.toList());
    }

    /**
     * To get transaction that is selected by Id and Type
     *
     * @param id user id a.k.a user emial
     * @param type type of transaction
     * @return response list of transactions that is selected by Id and Type
     * @throws ParseException
     */
    public TransactionResponse getTransactionByIdAndType(String id, String type) throws ParseException {
        TransactionResponse response = new TransactionResponse();
        Predicate<Transaction> byId = t -> t.getId().equals(id);
        Predicate<Transaction> byType = t -> t.getType().equals(type);
        response.setTransaction(idAndTypefilterTransaction(byType, byId));
        return response;
    }

    /**
     * Filter for Id and Type
     *
     * @param typeStrategy strategy to filter type
     * @param idStrategy strategy to filter id
     * @return list of transactions that is selected by Id and Type
     * @throws ParseException
     */
    public List<Transaction> idAndTypefilterTransaction(Predicate<Transaction> typeStrategy,
                                                        Predicate<Transaction> idStrategy) throws ParseException {
        return processAllTransaction().getTransactionList().stream().filter(typeStrategy).filter(idStrategy).collect(Collectors.toList());
    }
}
