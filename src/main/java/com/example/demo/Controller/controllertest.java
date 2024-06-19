package com.example.demo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/testeo")
public class controllertest {
    @GetMapping
    public ResponseEntity<String> getAllAcounts() {
        return new ResponseEntity<String>("oc todo bien v1.0", null, 200);
    }
}
