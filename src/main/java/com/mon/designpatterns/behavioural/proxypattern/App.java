package com.mon.designpatterns.behavioural.proxypattern;

public class App {
    public static void main(String[] args) {
        LazyBookParserProxy lazyBookParserProxy = new LazyBookParserProxy("book representation");
        long start = System.currentTimeMillis();
        lazyBookParserProxy.getNumberOfPages();
        long end = System.currentTimeMillis();
        System.out.println("total time: " + (end-start));

        long startAgain = System.currentTimeMillis();
        lazyBookParserProxy.getNumberOfAdverbs();
        long endAgain = System.currentTimeMillis();
        System.out.println("total time: " + (endAgain-startAgain));
    }
}
