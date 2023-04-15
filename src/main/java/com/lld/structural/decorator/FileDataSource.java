package com.lld.structural.decorator;

public class FileDataSource implements Datasource {

    public String read() {
        return "Base Value";
    }

    public void write(String value) {
        System.out.println("Some Value");
    }
}
