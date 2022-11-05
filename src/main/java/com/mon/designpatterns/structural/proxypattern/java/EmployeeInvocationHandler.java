package com.mon.designpatterns.structural.proxypattern.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EmployeeInvocationHandler implements InvocationHandler {

    private final IEmployee employee;

    public EmployeeInvocationHandler(IEmployee employee) {
        this.employee = employee;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().equals("hike")){
            double amount = (double) args[0];
            if(amount < 0) throw new RuntimeException("invalid amount");
        }
        Object returnValue = method.invoke(employee, args);

        System.out.println("proxy method invoke");
        return returnValue;
    }
}
