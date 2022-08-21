package com.mon.designpatterns.creational.abstractfactorypattern.factory;

import com.mon.designpatterns.creational.abstractfactorypattern.reading.AdvancedChemistry;
import com.mon.designpatterns.creational.abstractfactorypattern.reading.ReadingMaterial;
import com.mon.designpatterns.creational.abstractfactorypattern.writing.Biro;
import com.mon.designpatterns.creational.abstractfactorypattern.writing.WritingMaterial;

/**
 * Author: Monsuru <br/>
 * Created on 19/08/2022 8:57 PM
 */
public class SecondarySchoolMaterialsFactory implements SchoolMaterialsAbstractFactory{
    @Override
    public WritingMaterial createWritingMaterial() {
        return new Biro(100, "Ball pen");
    }

    @Override
    public ReadingMaterial createReadingMaterial() {
        return new AdvancedChemistry(1_500, 10_000, "New School Chemistry");
    }
}
