package com.lld.structural.decorator;

//Step 1: Implement common interface
public class BaseDataSource implements Datasource {

    //Step 2: Accepting the current entity in the constructor
    private Datasource datasource;

    public BaseDataSource(Datasource datasource) {
        this.datasource = datasource;
    }

    public String read() {
        return datasource.read();
    }

    public void write(String value) {
        datasource.write(value);
    }
}
