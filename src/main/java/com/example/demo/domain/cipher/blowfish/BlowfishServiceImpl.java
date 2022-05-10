package com.example.demo.domain.cipher.blowfish;


import com.example.demo.domain.cipher.blowfish.dto.KeyStringAnswer;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

/**
 * @author anton
 **/
@Service
@RequiredArgsConstructor
public class BlowfishServiceImpl implements BlowfishService {
    public KeyStringAnswer encryptHex(String plainText) {
        Blowfish blowfish = new Blowfish();
        return new KeyStringAnswer(blowfish.getKey(), blowfish.encryptHex(plainText));
    }

    public KeyStringAnswer encryptBase64(String plainText) {
        Blowfish blowfish = new Blowfish();
        return new KeyStringAnswer(blowfish.getKey(), encodeBase64(blowfish.encrypt(plainText)));
    }

    public KeyStringAnswer encrypt(String plainText) {
        Blowfish blowfish = new Blowfish();
        return new KeyStringAnswer(blowfish.getKey(), blowfish.encrypt(plainText));
    }

    public KeyStringAnswer encryptWithKey(String plainText, String key) {
        Blowfish blowfish = new Blowfish(key);
        return new KeyStringAnswer(blowfish.getKey(), blowfish.encrypt(plainText));
    }

    public KeyStringAnswer decryptHex(String cipherText, String key) {
        Blowfish blowfish = new Blowfish(key);
        return new KeyStringAnswer(blowfish.getKey(), blowfish.decryptHex(cipherText));
    }

    public KeyStringAnswer decryptBase64(String cipherText, String key) {
        Blowfish blowfish = new Blowfish(key);
        return new KeyStringAnswer(blowfish.getKey(), blowfish.decrypt(decodeBase64(cipherText)));
    }

    public KeyStringAnswer decrypt(String cipherText, String key) {
        Blowfish blowfish = new Blowfish(key);
        return new KeyStringAnswer(blowfish.getKey(), blowfish.decrypt(cipherText));
    }

    public String encodeBase64(String s) {
        return Base64.encodeBase64String(s.getBytes(StandardCharsets.UTF_8));
    }

    public String decodeBase64(String s) {
        return new String(Base64.decodeBase64(s), StandardCharsets.UTF_8);
    }
}
