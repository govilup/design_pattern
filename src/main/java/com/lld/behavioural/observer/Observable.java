package com.lld.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    List<Observer> observers = new ArrayList<>();

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void deregister(Observer observer) {
        observers.remove(observer);
    }

    public void notifyChange() {
        observers.forEach(Observer::notifyChange);
    }
}
