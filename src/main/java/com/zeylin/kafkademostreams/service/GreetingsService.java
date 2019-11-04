package com.zeylin.kafkademostreams.service;

import com.zeylin.kafkademostreams.model.Greetings;
import com.zeylin.kafkademostreams.stream.GreetingsStreams;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import java.time.Instant;

@Service
@Slf4j
public class GreetingsService {

    private GreetingsStreams greetingsStreams;

    public GreetingsService(GreetingsStreams greetingsStreams) {
        this.greetingsStreams = greetingsStreams;
    }

    public void sendGreeting(String message) {
        log.info("Send greetings");

        Greetings greetings = Greetings.builder()
                .timestamp(Instant.now().toEpochMilli())
                .message(message)
                .build();

        MessageChannel messageChannel = greetingsStreams.outboundGreetings();
        messageChannel.send(MessageBuilder
                .withPayload(greetings)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }

}
