package com.github.acnaweb.springeventasync.event;

import org.springframework.context.ApplicationEvent;

public class CreatedMessageEvent extends ApplicationEvent {

	private static final long serialVersionUID = 5470432632298997440L;

	public CreatedMessageEvent(Message source) {
		super(source);
	}

}
