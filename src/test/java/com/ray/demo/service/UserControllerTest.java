package com.ray.demo.service;

import com.ray.demo.controller.UserController;
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

public class UserControllerTest {

    /**
     * Test get All User Info
     *
     * @throws ParseException
     */
    @Test
    public void getAllUserInfoTest() throws ParseException {
        TestContext testContext = new TestContext();
        ResponseEntity<UserResponse> responseEntity = testContext.userController.getAllUserInfo();
        assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);
    }

    /**
     * Test get User By Id
     *
     * @throws ParseException
     */
    @Test
    public void getUserByIdTest() throws ParseException {
        TestContext testContext = new TestContext();
        ResponseEntity<UserResponse> responseEntity = testContext.userController.getUserById(any(String.class));
        assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);
    }

    /**
     * Test context class
     */
    private class TestContext {

        @InjectMocks
        private UserController userController;

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
