package com.lld.creational.factory;

public class Driver {

    public static void main(String[] args) {
        CardOrderFactory cardOrderFactory = new CardOrderFactory();
        CardOrderProcessor cardOrderProcessor = cardOrderFactory.getCardOrderProcessor(OrderType.ADDON);
        System.out.println(cardOrderProcessor.generateCardOrder());
    }
}
