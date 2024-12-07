package com.mon.designpatterns.creational.builder;

public class App {
    public static void main(String[] args) {
        User user = User.builder()
                .firstName("John")
                .lastName("Doe")
                .email("john@doe.com")
                .build();

        System.out.println(user);
    }
}
