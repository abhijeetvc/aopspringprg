package com.spaop.aopspringprg.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopClass {

//    @After("execution (* com.spaop.aopspringprg.impl.MyImpl.checkAop())")
//    public void executeAop(){
//        System.out.println("in aop class");
//    }

    @Before("execution (* com.spaop.aopspringprg.impl.MyImpl.checkAop())")
    public void executeAop(){
        System.out.println("in aop class");
    }
}
