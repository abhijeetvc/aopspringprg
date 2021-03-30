package com.spaop.aopspringprg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class AopspringprgApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopspringprgApplication.class, args);
	}

}

// AOP Terminology:
// a) Aspect: It is cross-cutting concern.
// b) JoinPoint: It is a point that represents the execution of method.
// c) Advice: Advice is an action taken by aspect. (After, Before, Around, AfterReturning, AfterThrowing).
// d) PointCut: A scenario that matches the joinpoint.