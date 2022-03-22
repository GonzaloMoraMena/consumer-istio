package com.example.consumer;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@AllArgsConstructor
public class Controller {
    private Client client;

    @GetMapping
    public Map<String, String> getStatus() {
        return client.getPrices();
    }

}
