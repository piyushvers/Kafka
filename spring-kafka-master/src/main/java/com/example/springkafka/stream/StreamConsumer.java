package com.example.springkafka.stream;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Slf4j
@Component
public class StreamConsumer {

    @Bean
    public Consumer<String> input() {
        return (s) -> log.info("Received - {}", s);
    }
}
