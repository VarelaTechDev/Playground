package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

        @PostMapping("/hi")
        public ResponseEntity<Void> setUsername(@RequestBody NameRequest nameRequest) {
            return ResponseEntity.ok()
                    .header("username", nameRequest.getName())
                    .build();
        }

        @GetMapping("/hi")
        public ResponseEntity<String> greet(@RequestHeader(value = "username", required = false) String username) {
            if (username != null && !username.isEmpty()) {
                return ResponseEntity.ok("Hello " + username);
            } else {
                return ResponseEntity.badRequest().body("Username header is missing or empty");
            }
        }

        public static class NameRequest {
            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
