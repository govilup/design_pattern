package com.lld.creational.factory;

public class CardOrderFactory {

    public CardOrderProcessor getCardOrderProcessor(OrderType orderType) {
        switch (orderType) {
            case SINGLE -> {return new SingleCardOrderProcessor();}
            case BULK -> {return new BulkCardOrderProcessor();}
            case ADDON -> {return new AddOnCardOrderProcessor();}
        }
        return null;
    }
}
