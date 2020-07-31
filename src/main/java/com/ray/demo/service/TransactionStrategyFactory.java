package com.ray.demo.service;

import com.ray.demo.model.TransactionResponse;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Service layer factory for transaction functions
 */
@Service
public class TransactionStrategyFactory {

    /**
     * The {@link TransactionStrategy }.
     */
    @Inject
    TransactionStrategy transactionStrategy;

    /**
     * To get transaction that is selected by Date
     *
     * @param date Date of transaction
     * @return response list of transaction that is selected by Date
     * @throws ParseException
     */
    public TransactionResponse getTransactionByDate(String date) throws ParseException {
        Date targetDate = new SimpleDateFormat("yyyy-mm-dd-hh").parse(date);
        return transactionStrategy.getTransactionByDate(targetDate);
    }

    /**
     * To get all transactions
     *
     * @return all transaction
     * @throws ParseException
     */
    public TransactionResponse getAllTransaction() throws ParseException {
        return transactionStrategy.processAllTransaction();
    }

    /**
     * To get transaction that is selected by Id and Date
     *
     * @param id user id a.k.a user emial
     * @param date date of transaction
     * @return response list of transactions that is selected by Id and Date
     * @throws ParseException
     */
    public TransactionResponse getTransactionByIdAndDate(String id, String date) throws ParseException{
        Date targetDate = new SimpleDateFormat("yyyy-mm-dd-hh").parse(date);
        return transactionStrategy.getTransactionByIdAndDate(id, targetDate);
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
        return transactionStrategy.getTransactionByIdAndType(id, type);
    }
}
