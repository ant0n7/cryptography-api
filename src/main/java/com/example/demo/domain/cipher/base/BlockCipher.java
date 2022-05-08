package com.example.demo.domain.cipher.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

/**
 * @author anton
 * @since 5/3/2022, Tue
 **/
@Entity(name = "tbl_cipher")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class BlockCipher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

}
