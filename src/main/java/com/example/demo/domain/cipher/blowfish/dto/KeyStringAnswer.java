package com.example.demo.domain.cipher.blowfish.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author anton
 * @since 5/10/2022, Tue
 **/
@AllArgsConstructor
@Getter
@Setter
public class KeyStringAnswer {
    private String key;
    private String string;
}
