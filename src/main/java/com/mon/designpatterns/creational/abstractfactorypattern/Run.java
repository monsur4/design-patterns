package com.mon.designpatterns.creational.abstractfactorypattern;

import com.mon.designpatterns.creational.abstractfactorypattern.factory.ElementSchoolMaterialsFactory;
import com.mon.designpatterns.creational.abstractfactorypattern.factory.SchoolMaterialsAbstractFactory;
import com.mon.designpatterns.creational.abstractfactorypattern.factory.SecondarySchoolMaterialsFactory;

/**
 * Author: Monsuru <br/>
 * Created on 19/08/2022 9:02 PM
 */
public class Run {
    private SchoolMaterialsAbstractFactory abstractFactory;
    public Run(SchoolMaterialsAbstractFactory abstractFactory){
        this.abstractFactory = abstractFactory;
    }

    public void display(){
        System.out.println("readingMaterial = " + abstractFactory.createReadingMaterial());
        System.out.println("writingMaterial = " + abstractFactory.createWritingMaterial());
    }

    public static void main(String[] args) {
        SchoolMaterialsAbstractFactory abstractFactory = new ElementSchoolMaterialsFactory();
        Run run = new Run(abstractFactory);
        run.display();

        System.out.println("\n\n");

        abstractFactory = new SecondarySchoolMaterialsFactory();
        run = new Run(abstractFactory);
        run.display();
    }
}
