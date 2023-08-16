package com.design.patterns.abstractFactory;

import com.design.patterns.abstractFactory.concreteFactory.AsusManufacturer;
import com.design.patterns.abstractFactory.concreteFactory.DellManufacturer;
import com.design.patterns.abstractFactory.concreteFactory.MsiManufacturer;
import com.design.patterns.abstractFactory.abstractFactory.Company;
import com.design.patterns.abstractFactory.products.Gpu;
import com.design.patterns.abstractFactory.products.Monitor;

public class Main {
    public static void main(String[] args) {
        Company msi = new MsiManufacturer();

        Gpu msiGpu = msi.createGpu();
        msiGpu.assemble();

        Monitor msiMonitor = msi.createMonitor();
        msiMonitor.assemble();

        Company asus = new AsusManufacturer();

        Gpu asusGpu = asus.createGpu();
        asusGpu.assemble();

        Monitor asusMonitor = asus.createMonitor();
        asusMonitor.assemble();

        Company dell = new DellManufacturer();

        Monitor dellMonitor = dell.createMonitor();
        dellMonitor.assemble();

        Gpu dellGpu = dell.createGpu();
        dellGpu.assemble();
    }
}
