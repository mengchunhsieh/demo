package com.ray.demo.service;

import com.ray.demo.impl.TransactionImpl;
import com.ray.demo.model.TransactionResponse;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.testng.annotations.Test;

import java.text.ParseException;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.testng.Assert.assertEquals;

public class TransactionImplTest {

    /**
     * Test get All Transaction
     *
     * @throws ParseException
     */
    @Test
    public void getAllTransactionTest() throws ParseException {
        TestContext testContext = new TestContext();
        ResponseEntity<TransactionResponse> responseResponseEntity = testContext.transactionImpl.getAllTransaction();
        assertEquals(responseResponseEntity.getStatusCode(), HttpStatus.OK);
    }

    /**
     * Test get Transaction By Date
     *
     * @throws ParseException
     */
    @Test
    public void getTransactionByDateTest() throws ParseException {
        TestContext testContext = new TestContext();
        ResponseEntity<TransactionResponse> responseResponseEntity = testContext.transactionImpl
                .getTransactionByDate(any(String.class));
        assertEquals(responseResponseEntity.getStatusCode(), HttpStatus.OK);
    }

    /**
     * Test get Transaction By Id And Date
     *
     * @throws ParseException
     */
    @Test
    public void getTransactionByIdAndDateTest() throws ParseException {
        TestContext testContext = new TestContext();
        ResponseEntity<TransactionResponse> responseResponseEntity = testContext.transactionImpl
                .getTransactionByIdAndDate(any(String.class), any(String.class));
        assertEquals(responseResponseEntity.getStatusCode(), HttpStatus.OK);
    }

    /**
     * Test get Transaction By Id And Type Success
     *
     * @throws ParseException
     */
    @Test
    public void getTransactionByIdAndTypeSuccessTest() throws ParseException {
        TestContext testContext = new TestContext();
        ResponseEntity<TransactionResponse> responseResponseEntity = testContext.transactionImpl
                .getTransactionByIdAndType(any(String.class), any(String.class));
        assertEquals(responseResponseEntity.getStatusCode(), HttpStatus.OK);
    }

    /**
     * Test context class
     */
    private class TestContext {

        @InjectMocks
        private TransactionImpl transactionImpl;

        @Mock
        private TransactionGetStrategyFactory transactionGetStrategyFactory;

        @Mock
        private TransactionGetStrategy transactionGetStrategy;

        /**
         *  The constructor
         */
        public TestContext() {
            initMocks(this);
        }
    }
}
