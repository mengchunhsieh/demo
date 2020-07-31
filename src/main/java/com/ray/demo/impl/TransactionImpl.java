package com.ray.demo.impl;

import com.ray.demo.model.TransactionResponse;
import com.ray.demo.service.TransactionStrategyFactory;
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
     * To get target transactions that is selected by Date.
     *
     * @param date Input Date
     * @return Transaction Response that is get by Date
     * @throws ParseException
     */
    @RequestMapping("/transaction/{date}")
    public TransactionResponse getTransactionByDate(@PathVariable("date") String date) throws ParseException {
        return transactionStrategyFactory.getTransactionByDate(date);
    }

    /**
     * To all transaction.
     *
     * @return All Transaction
     * @throws ParseException
     */
    @RequestMapping("/transactions")
    public TransactionResponse getAllTransaction() throws ParseException {
        return transactionStrategyFactory.getAllTransaction();
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
    public TransactionResponse getTransactionByIdAndDate(@PathVariable("id") String id,
                                                         @PathVariable("date") String date) throws ParseException{
        return transactionStrategyFactory.getTransactionByIdAndDate(id, date);
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
    public TransactionResponse getTransactionByIdAndType(@PathVariable("id") String id,
                                                         @PathVariable("type") String type) throws ParseException{
        return transactionStrategyFactory.getTransactionByIdAndType(id, type);
    }
}
