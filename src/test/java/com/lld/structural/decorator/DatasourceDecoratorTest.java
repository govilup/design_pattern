package com.lld.structural.decorator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatasourceDecoratorTest {

    private Datasource datasource = null;

    @BeforeEach
    public void setup() {
        datasource = new FileDataSource();
    }

    @Test
    void testBaseDataSource() {
        String value = datasource.read();
        assertEquals("Base Value", value);
    }

    @Test
    void testCompressionDecorator() {
        Datasource compressionDataSource = new CompressionDataSource(datasource);
        Datasource encryptedDatasource  = new EncryptionDataSource(compressionDataSource);
        assertEquals("Decompressed Value", compressionDataSource.read());
        assertEquals("Decrypted Value", encryptedDatasource.read());
    }
}
