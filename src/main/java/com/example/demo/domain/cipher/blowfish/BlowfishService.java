package com.example.demo.domain.cipher.blowfish;

import com.example.demo.domain.cipher.blowfish.dto.KeyStringAnswer;

/**
 * Service interface for the Blowfish service methods.
 * @author anton
 **/
public interface BlowfishService {
    KeyStringAnswer encryptHex(String plainText);
    KeyStringAnswer encryptBase64(String plainText);
    KeyStringAnswer encrypt(String plainText);
    KeyStringAnswer encryptWithKey(String plainText, String key);
    KeyStringAnswer decryptHex(String cipherText, String key);
    KeyStringAnswer decryptBase64(String cipherText, String key);
    KeyStringAnswer decrypt(String cipherText, String key);
    String encodeBase64(String s);
    String decodeBase64(String s);
}
