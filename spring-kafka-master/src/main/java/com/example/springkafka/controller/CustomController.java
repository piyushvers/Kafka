package com.example.springkafka.controller;

import com.example.springkafka.model.MessageDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/custom")
public class CustomController {

    private final StreamBridge streamBridge;

    public CustomController(@Autowired StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    @PostMapping
    public void sendCustomMessage(@RequestBody MessageDto message) {
        this.streamBridge.send("output-out-0", message.getMessage());
    }
}
