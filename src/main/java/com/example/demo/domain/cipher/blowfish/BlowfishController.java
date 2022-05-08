package com.example.demo.domain.cipher.blowfish;

import com.example.demo.domain.group.Group;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Controller for all Blowfish actions.
 * @author anton
 **/
@RestController
@RequestMapping("/api/cipher/blowfish")
@RequiredArgsConstructor
public class BlowfishController {
    @PreAuthorize("hasRole('ADMIN')")
    @Operation(summary = "Test endpoint", description = "Receive a message with an HTTP status code.")
    @GetMapping("/")
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("This endpoint is working.", HttpStatus.OK);
    }
}
