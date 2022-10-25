package com.gregorio.backingboot;

import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.stereotype.Component;

@Component
public class Sleeper {

    @NewSpan("Zzzzzzzzzzzzzz")
    public void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
