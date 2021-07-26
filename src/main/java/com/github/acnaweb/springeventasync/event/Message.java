package com.github.acnaweb.springeventasync.event;

import java.time.Instant;
import lombok.Data;

@Data
public class Message {
	private Long id;
	private String message;
	private final Instant timestamp = Instant.now();
}
