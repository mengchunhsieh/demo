package com.ray.demo.service;

import com.ray.demo.model.UserResponse;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.text.ParseException;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.mockito.Mockito.verify;

public class UserGetStrategyFactoryTest {

    @Test
    public void getAllUserInfoTest() throws ParseException {
        TestContext testContext = new TestContext();
        UserResponse userResponse = testContext.userGetStrategyFactory.getAllUserInfo();
        verify(testContext.userGetStrategy, times(1)).processAllUserInfo();
    }

    @Test
    public void getUserByIdTest() throws ParseException {
        TestContext testContext = new TestContext();
        UserResponse userResponse = testContext.userGetStrategyFactory.getUserById(any(String.class));
        verify(testContext.userGetStrategy, times(1)).getUserById(any(String.class));
    }

    /**
     * Test context class
     */
    private class TestContext {

        @InjectMocks
        private UserGetStrategyFactory userGetStrategyFactory;

        @Mock
        private UserGetStrategy userGetStrategy;

        /**
         *  The constructor
         */
        public TestContext() {
            initMocks(this);
        }
    }
}
