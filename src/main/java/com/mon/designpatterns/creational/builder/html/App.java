package com.mon.designpatterns.creational.builder.html;

public class App {
    public static void main(String[] args) {
        String htmlDocument = new HtmlDocument()
                .header("This is a header document")
                .body("This is a body document")
                .footer("This is a footer document")
                .html();

        System.out.println(htmlDocument);
    }
}
