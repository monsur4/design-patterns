package com.mon.designpatterns.creational.builder.html;

/**
 * Immutable: returning a new instance of HtmlDocument with every method call
 */
public class HtmlDocument {
    private final String content;

    public HtmlDocument() {
        this("");
    }

    public HtmlDocument(String content) {
        this.content = content;
    }

    public HtmlDocument header(String header){
        return new HtmlDocument(String.format("%s <h1>%s</h1>", content, header));
    }

    public HtmlDocument body(String body){
        return new HtmlDocument(String.format("%s <body>%s</body>", content, body));
    }

    public HtmlDocument footer(String footer){
        return new HtmlDocument(String.format("%s <h2>%s</h2>", content, footer));
    }

    public String html(){
        return String.format("<html>%s</html>", content);
    }
}
