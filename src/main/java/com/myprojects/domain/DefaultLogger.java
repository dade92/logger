package com.myprojects.domain;

public class DefaultLogger implements Logger {
    @Override
    public void info(String message) {
        System.out.println(message);
    }
}
