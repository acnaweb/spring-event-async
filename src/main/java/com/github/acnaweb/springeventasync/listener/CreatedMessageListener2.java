package com.github.acnaweb.springeventasync.listener;

import com.github.acnaweb.springeventasync.event.CreatedMessageEvent;
import com.github.acnaweb.springeventasync.event.Message;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CreatedMessageListener2 implements ApplicationListener<CreatedMessageEvent> {

	@Override
	public void onApplicationEvent(CreatedMessageEvent event) {
		var message = (Message) event.getSource();
		System.out.println("Listener 2 " + message);
	}
}
