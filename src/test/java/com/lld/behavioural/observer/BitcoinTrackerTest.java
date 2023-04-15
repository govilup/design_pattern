package com.lld.behavioural.observer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitcoinTrackerTest {

    private BitcoinTracker bitcoinTracker;

    @BeforeEach
    void setUp() {
        bitcoinTracker = new BitcoinTracker();
        bitcoinTracker.register(new EmailNotifier());
        bitcoinTracker.register(new TweetService());
    }

    @Test
    void testForPriceChange() {
        bitcoinTracker.setPrice(100.0);
        Bitcoin bitcoin = bitcoinTracker.getBitcoin();
        assertEquals(100.0, bitcoin.getPrice());
    }


}