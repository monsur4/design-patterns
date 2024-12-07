package com.mon.designpatterns.creational.builder.fluentmatcher.impl;

import com.mon.designpatterns.creational.builder.fluentmatcher.FileMatcher;

public abstract class BaseFileMatcher implements FileMatcher {

    protected final String fileName;

    public BaseFileMatcher(String fileName) {
        this.fileName = fileName;
    }

}
