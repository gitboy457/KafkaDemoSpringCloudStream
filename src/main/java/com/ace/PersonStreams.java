package com.ace;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface PersonStreams {
	String INPUT = "person-in";
	String OUTPUT = "person-out";

	@Input(INPUT)
	SubscribableChannel inboundGreetings();

	@Output(OUTPUT)
	MessageChannel outboundGreetings();
}
