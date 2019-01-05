package org.hungrysnake.controllers;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api")
public class GameController {

    @RequestMapping("/test")
    public String test() {
        return "test v2";
    }
}