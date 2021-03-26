package com.spaop.aopspringprg.impl;

import com.spaop.aopspringprg.repository.MyInterface;
import org.springframework.stereotype.Service;

// @Component, @Service, @Repository

@Service
public class MyImpl implements MyInterface {

    @Override
    public String checkAop() {
        System.out.println("hiiiiiiiiiii");
        return "Hello Spring AOP";
    }
}
