package com.mon.designpatterns.creational.builder.fluentmatcher;

import com.mon.designpatterns.creational.builder.fluentmatcher.impl.PdfMatcher;
import com.mon.designpatterns.creational.builder.fluentmatcher.impl.SizeMatcher;
import com.mon.designpatterns.creational.builder.fluentmatcher.impl.XmlMatcher;

public class App {
    public static void main(String[] args) {
        String newFile = "sample.txt";

        FileMatcher fileMatcher1 = new SizeMatcher(newFile, 2L * 1024 * 1024)
                .or(new PdfMatcher(newFile))
                .or(new XmlMatcher(newFile));
        if(fileMatcher1.matches()) System.out.println("First files = [" + newFile + "]");

        FileMatcher fileMatcher2 = new PdfMatcher(newFile)
                .or(new XmlMatcher(newFile))
                .or(new SizeMatcher(newFile, 2L));
        if(fileMatcher2.matches()) System.out.println("Second files = [" + newFile + "]");

        FileMatcher fileMatcher3 = new SizeMatcher(newFile, 2L * 1024)
                .and(new PdfMatcher(newFile)
                        .or(new XmlMatcher(newFile)));
        if(fileMatcher3.matches()) System.out.println("Third files = [" + newFile + "]");
    }
}
