package com.example.demo.domain.cipher.blowfish;


import com.example.demo.domain.cipher.blowfish.dto.KeyStringAnswer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

/**
 * @author anton
 **/
@Service
@RequiredArgsConstructor
public class BlowfishServiceImpl implements BlowfishService {
    public KeyStringAnswer encrypt(String plainText) {
        Blowfish blowfish = new Blowfish();
        return new KeyStringAnswer(blowfish.getKey(), blowfish.encrypt(plainText));
    }
}
