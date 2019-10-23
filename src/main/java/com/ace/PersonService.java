package com.ace;

import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.util.MimeTypeUtils;
@Component
public class PersonService {
	
	private final PersonStreams personStreams;

	public PersonService(PersonStreams personStreams) {
		super();
		this.personStreams = personStreams;
	}
	
	
	//Producer
	public void sendPerson(final Person person) {
		MessageChannel messageChannel =    personStreams.outboundGreetings();
		messageChannel.send(MessageBuilder
                .withPayload(person)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
	}

}
