package com.ray.demo.service;

import com.ray.demo.impl.UserImpl;
import com.ray.demo.model.UserResponse;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.text.ParseException;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.testng.Assert.assertEquals;

public class UserImplTest {

    @Test
    public void getAllUserInfoSuccessTest() throws ParseException {
        TestContext testContext = new TestContext();
        ResponseEntity<UserResponse> responseEntity = testContext.userImpl.getAllUserInfo();
        assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);
    }

    @Test
    public void getUserByIdSuccessTest() throws ParseException {
        TestContext testContext = new TestContext();
        ResponseEntity<UserResponse> responseEntity = testContext.userImpl.getUserById(any(String.class));
        assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);
    }

    /**
     * Test context class
     */
    private class TestContext {

        @InjectMocks
        private UserImpl userImpl;

        @Mock
        private UserGetStrategyFactory userGetStrategyFactory;

        @Mock
        private  UserGetStrategy userGetStrategy;

        /**
         *  The constructor
         */
        public TestContext() {
            initMocks(this);
        }
    }
}
