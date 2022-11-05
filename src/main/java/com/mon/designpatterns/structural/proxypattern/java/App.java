package com.mon.designpatterns.structural.proxypattern.java;

import java.lang.reflect.Proxy;

public class App {

    public static void main(String[] args) {
        ITEmployee itEmployee = new ITEmployee();
        itEmployee.setSalary(30_000);

        EmployeeInvocationHandler employeeInvocationHandler = new EmployeeInvocationHandler(itEmployee);
        IEmployee employeeProxy = (IEmployee)Proxy.newProxyInstance(ITEmployee.class.getClassLoader(),
                new Class[]{IEmployee.class},
                employeeInvocationHandler);

        employeeProxy.hike(5000);
        System.out.println(employeeProxy.getSalary());
    }
}
