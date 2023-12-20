package com.application.coms.admin.Logger.controller;

import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAdvice {

    private static final Logger logger = LoggerFactory.getLogger(LoggerAdvice.class);

    @AfterReturning(pointcut = "execution(public String com.application.coms.admin.member.controller.AdminMemberController.adminLogin(..))",
                    returning = "result")
    public void afterReturningAdminLogin(JoinPoint jp, Object result) {
    	
    	Date time = new Date();
    	
    	System.out.println("Admin login success - Notification sent!");
    	System.out.println("1 : " + jp.getKind());						
		System.out.println("2 : " + jp.getSignature().getName());		
		System.out.println("3 : " + jp.getTarget());					
		System.out.println("4 : " + time);

    }
}
