package com.github.acnaweb.springeventasync.publisher;

import com.github.acnaweb.springeventasync.event.CreatedMessageEvent;
import com.github.acnaweb.springeventasync.event.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MessagePublisher {

	private final ApplicationEventPublisher publisher;

	public void publish(Message message) {
		publisher.publishEvent(new CreatedMessageEvent(message));
	}

}
