package com.zeylin.kafkademostreams.config;

import com.zeylin.kafkademostreams.stream.GreetingsStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(GreetingsStreams.class)
public class StreamConfig {
}
