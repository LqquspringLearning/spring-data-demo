package com.thoughtworks.spring.learning.springwithaop.Aspects;

import com.thoughtworks.spring.learning.springwithaop.Services.MyLogger;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    @Autowired
    MyLogger logger;

    @Before(value = "@annotation(com.thoughtworks.spring.learning.springwithaop.Services.LogService)")
    public void beforeAdvice() {
        logger.getLog().add("before method");
    }

    @After(value = "@annotation(com.thoughtworks.spring.learning.springwithaop.Services.LogService)")
    public void afterAdvice() {
        logger.getLog().add("after method");
    }

    @AfterThrowing(value = "@annotation(com.thoughtworks.spring.learning.springwithaop.Services.LogService)",throwing = "ex")
    public void afterThrow(Exception ex) {

        logger.getLog().add("after throw");
    }

    @AfterReturning(value = "@annotation(com.thoughtworks.spring.learning.springwithaop.Services.LogService)")
    public void afterReturnAdvice() {
        logger.getLog().add("after return");
    }


    // @Around(value = "@annotation(com.thoughtworks.spring.learning.springwithaop.Services.LogService)")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        proceedingJoinPoint.proceed();
        logger.getLog().add("around");
    }


}
