package com.github.acnaweb.springeventasync.listener;

import com.github.acnaweb.springeventasync.event.CreatedMessageEvent;
import com.github.acnaweb.springeventasync.event.Message;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CreatedMessageListener1 {

	@EventListener
	public void handle1(CreatedMessageEvent event) {
		var message = (Message) event.getSource();
		System.out.println("Listener 1 " + message);
	}

	@EventListener
	public void handle3(CreatedMessageEvent event) {
		var message = (Message) event.getSource();
		System.out.println("Listener 3 " + message);
	}
}
