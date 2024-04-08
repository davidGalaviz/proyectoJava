package com.master.naxer.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.master.naxer.service.TextService.getText(..))")
    public void logBeforeMethodExecution() {
        System.out.println("Before getText() execution");
    }

    @After("execution(* com.master.naxer.service.TextService.getText(..))")
    public void logAfterMethodExecution() {
        System.out.println("After (finally) getText() execution");
    }

    @AfterThrowing("execution(* com.master.naxer.service.TextService.*(..))")
    public void logException(JoinPoint jp) {
        System.out.println(String.format("[TextService] %s - An exception occurred", jp.toString()));
    }

}
