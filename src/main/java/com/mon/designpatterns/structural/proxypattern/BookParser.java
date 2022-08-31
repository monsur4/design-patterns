package com.mon.designpatterns.structural.proxypattern;

public class BookParser implements IBookParser{

    private String book;
    private int numberOfpages;
    private int numberOfAdverbs;

    public BookParser(String book) {
        this.book = book;
        // perform expensive operation
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.numberOfpages = 6000;
        this.numberOfAdverbs = 9847;
    }

    @java.lang.Override
    public int getNumberOfPages() {
        return numberOfpages;
    }

    @java.lang.Override
    public int getNumberOfAdverbs() {
        return numberOfAdverbs;
    }
}
