package com.example.designpatterndemo.singletonpattern;

public class SingletonPattern {

    private SingletonPattern() {
    }

    private static volatile SingletonPattern singletonPattern;

    public static SingletonPattern getSingletonPattern() {
        if (singletonPattern == null) {
            synchronized (SingletonPattern.class) {
                if (singletonPattern == null) {
                    singletonPattern = new SingletonPattern();
                }
            }
        }
        return singletonPattern;
    }
}
