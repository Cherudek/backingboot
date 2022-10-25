package com.gregorio.backingboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackingBootController {

    private Sleeper sleeper;

    public BackingBootController(Sleeper sleeper) {
        this.sleeper = sleeper;
    }

    @GetMapping
    String hello() {
        return "Hello!";
    }

    @GetMapping("/reverse")
    String reverse(@RequestParam String inbound) {
        String s = new StringBuffer(inbound)
            .reverse()
            .toString();
        sleeper.sleep();
        return s;
    }
}
