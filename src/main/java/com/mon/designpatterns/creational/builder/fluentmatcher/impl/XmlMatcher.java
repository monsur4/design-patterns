package com.mon.designpatterns.creational.builder.fluentmatcher.impl;

public class XmlMatcher extends BaseFileMatcher {

    public XmlMatcher(String fileName) {
        super(fileName);
    }

    @Override
    public boolean matches() {
        return fileName.endsWith(".xml");
    }
}
