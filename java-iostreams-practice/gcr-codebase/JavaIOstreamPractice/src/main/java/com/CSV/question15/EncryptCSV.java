package com.CSV.question15;

import java.util.Base64;

public class EncryptCSV {

    static String encrypt(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }

    static String decrypt(String data) {
        return new String(Base64.getDecoder().decode(data));
    }

    public static void main(String[] args) {
        String salary = "50000";
        String enc = encrypt(salary);
        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + decrypt(enc));
    }
}
