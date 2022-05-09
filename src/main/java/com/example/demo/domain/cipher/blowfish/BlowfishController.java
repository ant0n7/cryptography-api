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

    @GetMapping("/encrypt/{plaintext}")
    public ResponseEntity<KeyStringAnswer> encrypt(@PathVariable String plaintext) {
        return new ResponseEntity<>(blowfishService.encrypt(plaintext), HttpStatus.OK);
    }
}
