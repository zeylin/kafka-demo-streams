package com.zeylin.kafkademostreams.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Greetings {

    private long timestamp;
    private String message;

}
