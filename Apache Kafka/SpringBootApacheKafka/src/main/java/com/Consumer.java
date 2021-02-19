package com;

import java.io.IOException;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    //private final Logger logger = LoggerFactory.getLogger(Producer.class);

    @KafkaListener(topics = "my_topic", groupId = "group_id2")
    public void consume(String message) throws IOException {
        System.err.printf("#### -> Consumed message -> %s", message);
    }
}
