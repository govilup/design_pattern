package com.lld.structural.decorator;

public class EncryptionDataSource implements Datasource {

    private final Datasource datasource;

    public EncryptionDataSource(Datasource datasource) {
        this.datasource = datasource;
    }

    public String read() {
        String value = datasource.read();
        return decrypt(value);
    }

    private String decrypt(String value) {
        return "Decrypted Value";
    }

    private String encrypt(String value) {
        return "Encrypted Value";
    }

    public void write(String value) {
        String encrypted = encrypt(value);
        datasource.write(encrypted);
    }
}
