package com.ray.demo.service;

import com.ray.demo.model.TransactionResponse;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;

public class TransactionGetStrategyFactoryTest {

    @Test
    public void getAllTransactionTest() throws ParseException {
        TestContext testContext = new TestContext();
        TransactionResponse transactionResponse = testContext.transactionGetStrategyFactory.getAllTransaction();
        verify(testContext.transactionGetStrategy, times(1)).processAllTransaction();
    }

    @Test
    public void getTransactionByDateTest() throws ParseException {
        TestContext testContext = new TestContext();
        TransactionResponse transactionResponse = testContext.transactionGetStrategyFactory.getTransactionByDate(testContext.testDateString);
        verify(testContext.transactionGetStrategy, times(1)).getTransactionByDate(testContext.date);
    }

    @Test
    public void getTransactionByIdAndDateTest() throws ParseException {
        TestContext testContext = new TestContext();
        TransactionResponse transactionResponse = testContext.transactionGetStrategyFactory.getTransactionByIdAndDate(testContext.testUser, testContext.testDateString);
        verify(testContext.transactionGetStrategy, times(1)).getTransactionByIdAndDate(testContext.testUser, testContext.date);
    }

    @Test
    public void getTransactionByIdAndTypeTest() throws ParseException {
        TestContext testContext = new TestContext();
        TransactionResponse transactionResponse = testContext.transactionGetStrategyFactory.getTransactionByIdAndType(testContext.testUser, testContext.testType);
        verify(testContext.transactionGetStrategy, times(1)).getTransactionByIdAndType(testContext.testUser, testContext.testType);
    }

    /**
     * Test context class
     */
    private class TestContext {

        private Date date;

        private String testDateString;

        private String testUser;

        private String testType;

        @InjectMocks
        TransactionGetStrategyFactory transactionGetStrategyFactory;

        @Mock
        TransactionGetStrategy transactionGetStrategy;

        /**
         *  The constructor
         */
        public TestContext() throws ParseException {
            testDateString = "2020-01-01-01";
            date = new SimpleDateFormat("yyyy-mm-dd-hh").parse(testDateString);
            testUser = "user0";
            testType = "type0";
            initMocks(this);
        }
    }
}
