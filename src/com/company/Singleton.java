package com.company;

public class Singleton {
    static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
