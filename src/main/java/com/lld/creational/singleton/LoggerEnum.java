package com.lld.creational.singleton;

/**
 * Achieving singleton using enums is convenient
 */
public enum LoggerEnum {

    LOGGER;

    public void log(String message) {
        System.out.println(message);
    }
}

