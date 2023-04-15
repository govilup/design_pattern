package com.lld.structural.decorator;

public interface Datasource {

    String read();

    void write(String value);
}
