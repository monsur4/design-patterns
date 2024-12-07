package com.mon.designpatterns.creational.builder.fluentmatcher;

public interface FileMatcher {

    boolean matches();

    default FileMatcher and(FileMatcher anotherFileMatcher) {
        return () -> matches() && anotherFileMatcher.matches();
    }

    default FileMatcher or(FileMatcher anotherFileMatcher) {
        return () -> matches() || anotherFileMatcher.matches();
    }
}
