package com.example.demo.domain.cipher.blowfish;

import com.example.demo.domain.appuser.UserService;
import com.example.demo.domain.cipher.blowfish.dto.KeyStringAnswer;
import com.example.demo.domain.group.Group;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Controller for all Blowfish actions.
 * @author anton
 **/
@RestController
@RequestMapping("/api/cipher/blowfish")
@RequiredArgsConstructor
public class BlowfishController {
    private final BlowfishService blowfishService;

    @PreAuthorize("hasRole('ADMIN')")
    @Operation(summary = "Test endpoint", description = "Receive a message with an HTTP status code.")
    @GetMapping("/")
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("This endpoint is working.", HttpStatus.OK);
    }

    @GetMapping("/encrypt/hex/{plaintext}")
    public ResponseEntity<KeyStringAnswer> encryptHex(@PathVariable String plaintext) {
        return new ResponseEntity<>(blowfishService.encryptHex(plaintext), HttpStatus.OK);
    }

    @GetMapping("/encrypt/base64/{plaintext}")
    public ResponseEntity<KeyStringAnswer> encryptBase64(@PathVariable String plaintext) {
        return new ResponseEntity<>(blowfishService.encryptBase64(plaintext), HttpStatus.OK);
    }

    @GetMapping("/encrypt/{plaintext}")
    public ResponseEntity<KeyStringAnswer> encrypt(@PathVariable String plaintext) {
        return new ResponseEntity<>(blowfishService.encrypt(plaintext), HttpStatus.OK);
    }

    @GetMapping("/encrypt/{plaintext}/{key}")
    public ResponseEntity<KeyStringAnswer> encryptWithKey(@PathVariable String plaintext, @PathVariable String key) {
        return new ResponseEntity<>(blowfishService.encryptWithKey(plaintext, key), HttpStatus.OK);
    }

    @GetMapping("/decrypt/hex/{ciphertext}/{key}")
    public ResponseEntity<KeyStringAnswer> decryptHex(@PathVariable String ciphertext, @PathVariable String key) {
        return new ResponseEntity<>(blowfishService.decryptHex(ciphertext, key), HttpStatus.OK);
    }

    @GetMapping("/decrypt/base64/{ciphertext}/{key}")
    public ResponseEntity<KeyStringAnswer> decryptBase64(@PathVariable String ciphertext, @PathVariable String key) {
        return new ResponseEntity<>(blowfishService.decryptBase64(ciphertext, key), HttpStatus.OK);
    }

    @GetMapping("/decrypt/{ciphertext}/{key}")
    public ResponseEntity<KeyStringAnswer> decrypt(@PathVariable String ciphertext, @PathVariable String key) {
        return new ResponseEntity<>(blowfishService.decrypt(ciphertext, key), HttpStatus.OK);
    }
}
