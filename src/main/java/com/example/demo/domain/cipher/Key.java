package com.example.demo.domain.cipher;

import java.util.Random;

/**
 * @author anton
 * @since 5/10/2022, Tue
 **/
public class Key {
    /**
     * Generates hexadecimal key string
     * @param size  Size in bits
     * @return      Hexadecimal key String object
     */
    public static String generateKey(int size)  {
        Random r = new Random();
        StringBuffer sb = new StringBuffer();
        while (sb.length() < size / 4) {
            sb.append(Integer.toHexString(r.nextInt()));
        }

        return sb.toString().substring(0, size / 4);
    }
}
