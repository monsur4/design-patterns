package com.mon.designpatterns.creational.builder.fluentmatcher.impl;

public class PdfMatcher extends BaseFileMatcher {

    public PdfMatcher(String fileName) {
        super(fileName);
    }

    @Override
    public boolean matches() {
        return fileName.endsWith(".pdf");
    }
}
