package com.mon.designpatterns.creational.abstractfactorypattern.factory;

import com.mon.designpatterns.creational.abstractfactorypattern.reading.ReadingMaterial;
import com.mon.designpatterns.creational.abstractfactorypattern.reading.UgoCUgo;
import com.mon.designpatterns.creational.abstractfactorypattern.writing.Pencil;
import com.mon.designpatterns.creational.abstractfactorypattern.writing.WritingMaterial;

/**
 * Author: Monsuru <br/>
 * Created on 19/08/2022 8:24 PM
 */
public class ElementSchoolMaterialsFactory implements SchoolMaterialsAbstractFactory{
    @Override
    public WritingMaterial createWritingMaterial() {
        return new Pencil(10, "pencil");
    }

    @Override
    public ReadingMaterial createReadingMaterial() {
        return new UgoCUgo(100, 3_000, "Ralia goes to school");
    }
}
