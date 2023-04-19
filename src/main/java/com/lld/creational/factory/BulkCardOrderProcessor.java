package com.lld.creational.factory;

public class BulkCardOrderProcessor implements CardOrderProcessor {

    @Override
    public String generateCardOrder() {
        return "Bulk Card Order";
    }
}
