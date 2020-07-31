//package com.ray.demo.impl;
//
//import com.ray.demo.model.DemoResponse;
//import com.ray.demo.model.User;
//import com.ray.demo.service.UserGetStrategyFactory;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.inject.Inject;
//
//@RestController
//public class UserImpl {
//
//    @Inject
//    UserGetStrategyFactory userGetStrategyFactory;
//
//    @RequestMapping("/user/{id}")
//    public DemoResponse getUserById(@PathVariable("id") String id) {
//        return userGetStrategyFactory.getUserById(id);
//    }
//
//}
