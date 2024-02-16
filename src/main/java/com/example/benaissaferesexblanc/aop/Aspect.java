package com.example.benaissaferesexblanc.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@org.aspectj.lang.annotation.Aspect
@Slf4j
public class Aspect {
    //Méthode: Advice
//    @Before("execution(* com.example.benaissaferesexblanc.services..*.*(..))")
//    public void method(JoinPoint jp){
//        log.info("hello "+jp.getSignature().getName());
//    }
//    @After("execution(* com.example.benaissaferesexblanc.services..*.*(..))")
//    public void methoAfter(JoinPoint jp){
//        log.info("Bye bye "+jp.getSignature().getName());
//    }
//
//    //    @Around("execution(* com.example.benaissaferesexblanc.services..*.ajoute*(..))")
//    @Around("execution(* com.example.benaissaferesexblanc.services..*.*(..))")
//    public Object tempsExecutionAspect(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
//        long start = System.currentTimeMillis();
//        Object obj = proceedingJoinPoint.proceed();
//        long end = System.currentTimeMillis();
//        long duration = end - start;
//        log.info("Date: " + java.time.LocalTime.now() + " - Method execution time: " + duration + "ms");
//        return obj;
//    }
}
