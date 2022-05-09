package com.example.demo.domain.cipher.blowfish;

import com.example.demo.domain.cipher.blowfish.dto.KeyStringAnswer;

/**
 * Service interface for the Blowfish service methods.
 * @author anton
 **/
public interface BlowfishService {
    KeyStringAnswer encrypt(String plainText);
}
