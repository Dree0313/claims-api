package controller;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class ControllerCheck {
    @PostConstruct
    public void init() {
        System.out.println("ControllerCheck is loaded!");
    }
}
