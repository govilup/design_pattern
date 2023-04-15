package com.lld.behavioural.observer;

public class TweetService implements Observer {
    @Override
    public void notifyChange() {
        System.out.println("Tweet");
    }
}
