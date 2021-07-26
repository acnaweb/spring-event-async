package com.github.acnaweb.springeventasync;

import com.github.acnaweb.springeventasync.event.Message;
import com.github.acnaweb.springeventasync.publisher.MessagePublisher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner run(MessagePublisher publisher) {

		return (args) -> {

			// publish
			for (long i = 1; i < 100; i++) {
				var message = new Message();
				message.setId(i);
				message.setMessage("Mensagem " + i);
				publisher.publish(message);
			}

		};
	}
}
