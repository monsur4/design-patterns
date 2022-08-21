package com.mon.designpatterns.creational.abstractfactorypattern.factory;

import com.mon.designpatterns.creational.abstractfactorypattern.reading.ReadingMaterial;
import com.mon.designpatterns.creational.abstractfactorypattern.writing.WritingMaterial;

/**
 * Author: Monsuru <br/>
 * Created on 19/08/2022 8:25 PM
 */
public interface SchoolMaterialsAbstractFactory {
    WritingMaterial createWritingMaterial();
    ReadingMaterial createReadingMaterial();
}
