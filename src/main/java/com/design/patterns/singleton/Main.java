package com.design.patterns.singleton;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Singleton singleton = Singleton.getInstance("Hello Hedi!");
            System.out.println(singleton);
        }
    }
}
