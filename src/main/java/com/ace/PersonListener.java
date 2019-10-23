package com.ace;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class PersonListener {
	
	@StreamListener(PersonStreams.INPUT)
    public void handleGreetings(@Payload Person Person) {
        System.out.println(Person);
    }

}
