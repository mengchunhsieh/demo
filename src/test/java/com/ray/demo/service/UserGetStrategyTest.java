package com.ray.demo.service;

import com.ray.demo.model.UserResponse;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import java.text.ParseException;

import static org.mockito.MockitoAnnotations.initMocks;
import static org.testng.Assert.assertNotEquals;


public class UserGetStrategyTest {

    /**
     * Test processAllUserInfo to get all user info
     * TODO: This can be change once DB is set up
     *
     * @throws ParseException
     */
    @Test
    public void testProcessAllUserInfo() throws ParseException {
        TestContext testContext = new TestContext();
        UserResponse response = testContext.userGetStrategy.processAllUserInfo();
        assertNotEquals(response.getUserList(), null);
        assertNotEquals(response.getUserList().size(), 0);
    }

    /**
     * Test context class
     */
    private class TestContext {

        @InjectMocks
        private UserGetStrategy userGetStrategy;

        /**
         *  The constructor
         */
        public TestContext() {
            initMocks(this);
        }
    }
}
