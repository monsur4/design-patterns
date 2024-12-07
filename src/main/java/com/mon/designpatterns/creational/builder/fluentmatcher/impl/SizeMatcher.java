package com.mon.designpatterns.creational.builder.fluentmatcher.impl;

import java.io.File;

public class SizeMatcher extends BaseFileMatcher {

    private final Long size;

    public SizeMatcher(String fileName, Long size) {
        super(fileName);
        this.size = size;
    }

    @Override
    public boolean matches() {
        return new File(this.fileName).getPath().length() >= size; // check the File class api for size
    }
}
