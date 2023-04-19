package com.lld.creational.singleton;

public class LoggerService {

    private static LoggerService logger = null;

    private LoggerService() {}

    //We can do a double checking locking as well.
    //but to do that we need to make the variable as volatile
    synchronized public static LoggerService getLogger() {
        if(logger == null) {
            return new LoggerService();
        }
        return logger;
    }
}
