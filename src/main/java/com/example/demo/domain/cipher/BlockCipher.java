package com.example.demo.domain.cipher;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigInteger;
import java.util.UUID;

/**
 * @author anton
 * @since 5/3/2022, Tue
 **/
//@Entity(name = "tbl_blockcipher")
@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public abstract class BlockCipher {
    public String hexToBin(String s) {
        int binStringSize = s.length() * 4;

        return String.format("%" + binStringSize + "s",
                new BigInteger(s, 16).toString(2)).replace(" ", "0");
    }

    public String binToHex(String s) {
        int hexStringSize = s.length() / 4;
        return String.format("%" + hexStringSize + "s",
                Long.toString(Long.parseUnsignedLong(s, 2), 16)).replace(" ", "0");
    }

    /**
     * XOR two strings
     * @param a Hexadecimal string of the same length as b
     * @param b Hexadecimal string of the same length as a
     * @return  Hexadecimal string of the same length as a & b
     */
    public String xor(String a, String b) {
        String binA = hexToBin(a);
        String binB = hexToBin(b);

        StringBuilder binaryResult = new StringBuilder();
        for (int i = 0; i < binA.length(); i++) {
            binaryResult.append((char) ((
                    (binA.charAt(i) - '0')
                            ^
                            (binB.charAt(i) - '0')
            ) + '0'));
        }

        return binToHex(binaryResult.toString());
    }

    /**
     * Convert a UTF-8 string to hexadecimal values
     * @param s String to convert
     * @return  Converted hexadecimal String object
     */
    public static String stringToHexString(String s) {
        char[] ch = s.toCharArray();
        StringBuffer sb = new StringBuffer();

        for (char c : ch) {
            sb.append(Integer.toHexString(c));
        }

        return sb.toString();
    }

    /**
     * Convert a hexadecimal string to UTF-8
     * @param s String to convert
     * @return  Converted UTF-8 String object
     */
    public static String hexStringToString(String s) {
        char[] ch = s.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < ch.length; i = i + 2) {
            String temp = "" + ch[i] + "" + ch[i + 1];
            char c = (char) Integer.parseInt(temp, 16);
            result.append(c);
        }

        return result.toString();
    }

    protected abstract String f(String s);
}
