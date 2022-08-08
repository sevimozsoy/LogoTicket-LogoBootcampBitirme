package com.example.sevimozsoy.logoticket.Config;

import org.springframework.context.annotation.Configuration;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Configuration
public class PasswordConfig {

    public String obtainSHA(String s) throws NoSuchAlgorithmException {

        MessageDigest msgDgst = MessageDigest.getInstance("SHA-256");


        BigInteger no = new BigInteger(1, msgDgst.digest(s.getBytes(StandardCharsets.UTF_8)));


        StringBuilder hexStr = new StringBuilder(no.toString(16));


        while (hexStr.length() < 32) {
            hexStr.insert(0, '0');
        }

        return hexStr.toString();
    }
}
