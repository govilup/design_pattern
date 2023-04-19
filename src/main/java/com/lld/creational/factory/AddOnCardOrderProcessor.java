package com.lld.creational.factory;

public class AddOnCardOrderProcessor implements CardOrderProcessor {

    @Override
    public String generateCardOrder() {
        return "Add On Card Processing";
    }
}
