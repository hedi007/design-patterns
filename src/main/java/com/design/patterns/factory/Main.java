package com.design.patterns.factory;

import com.design.patterns.factory.concreteCreators.KeyboradStore;
import com.design.patterns.factory.concreteCreators.MonitorStore;
import com.design.patterns.factory.concreteCreators.MouseStore;
import com.design.patterns.factory.creator.Store;

public class Main {
    public static void main(String[] args) {

        Store monitorStore = new MonitorStore();
        Product monitor = monitorStore.orderProduct();

        Store keyboardStore = new KeyboradStore();
        Product keyboard = keyboardStore.orderProduct();

        Store mouseStore = new MouseStore();
        Product mouse = mouseStore.orderProduct();
    }
}
