package com.lld.creational.singleton;

public class Client {

    public static void main(String[] args) {
        LoggerEnum logger = LoggerEnum.LOGGER;
        logger.log("Singleton from ENUM");
    }

}
