package com.booleanuk.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jokes")
public class JokeMachineController {
    private String joke;
    public JokeMachineController() {
        this.joke = "What sort of car does an egg drive? - A yolkswagen!!!";
    }
    @GetMapping
    public String getJoke() {
        return this.joke;
    }
}