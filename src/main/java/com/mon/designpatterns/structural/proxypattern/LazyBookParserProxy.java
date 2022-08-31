package com.mon.designpatterns.structural.proxypattern;

public class LazyBookParserProxy implements IBookParser{

    private final String book;
    private BookParser bookParser = null;

    public LazyBookParserProxy(String book) {
        this.book = book;
    }

    @Override
    public int getNumberOfPages() {
        if(bookParser == null){
            bookParser = new BookParser(book);
        }
        return bookParser.getNumberOfPages();
    }

    @Override
    public int getNumberOfAdverbs() {
        if(bookParser == null){
            bookParser = new BookParser(book);
        }
        return bookParser.getNumberOfAdverbs();
    }
}
