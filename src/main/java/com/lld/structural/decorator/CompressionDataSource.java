package com.lld.structural.decorator;

public class CompressionDataSource implements Datasource {

    private Datasource datasource;

    public CompressionDataSource(Datasource datasource) {
        this.datasource = datasource;
    }

    public String read() {
        String value = datasource.read();
        return decompress(value);
    }

    private String decompress(String value) {
        return "Decompressed Value";
    }

    public void write(String value) {
        String compressedValue = compress(value);
        datasource.write(compressedValue); //delegating the task.
    }

    private String compress(String value) {
        return "Compressed Value";
    }
}
