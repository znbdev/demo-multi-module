package com.example.demo.utils;

import java.util.UUID;

public class DemoUtil {
    // Truncate the first 8 characters as a random value
    // This is just a demo, not a secure way to generate random values
    public static String generateRandomValue() {
        String uuid = UUID.randomUUID().toString();
        return uuid.substring(0, 8);
    }
}
