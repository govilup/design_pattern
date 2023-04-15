package com.lld.behavioural.observer;

public class EmailNotifier implements Observer {
    @Override
    public void notifyChange() {
        System.out.println("Send Email...");
    }
}
