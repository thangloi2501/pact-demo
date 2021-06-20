package com.loi.pact.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pact")
public class PactController {

    @GetMapping
    public Pact getPact() {
        return Pact.builder()
                   .condition(true)
                   .name("tom")
                   .build();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void postPact(@RequestBody PactRequest request) {
        // do nothing
    }

    @Getter @Setter
    @Builder
    public static class Pact {
        private boolean condition;
        private String name;
    }

    @Getter @Setter
    @Builder @NoArgsConstructor @AllArgsConstructor
    public static class PactRequest {
        private String name;
    }
}
