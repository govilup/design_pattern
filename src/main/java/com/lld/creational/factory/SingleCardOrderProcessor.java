package com.lld.creational.factory;

public class SingleCardOrderProcessor implements CardOrderProcessor {


    @Override
    public String generateCardOrder() {
        return "Single card order";
    }
}
