package trabalho.v3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import trabalho.v3.handlers.WebsocketHandler;

@EnableWebSocket
@SpringBootApplication
public class TrabalhoV3Application implements WebSocketConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(TrabalhoV3Application.class, args);
	}

	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {

		registry.addHandler(new WebsocketHandler(), "/chat");

	}
}
