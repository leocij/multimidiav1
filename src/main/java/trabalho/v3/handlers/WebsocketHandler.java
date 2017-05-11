package trabalho.v3.handlers;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class WebsocketHandler extends TextWebSocketHandler {

	public static Map<String, WebSocketSession> sessions = new HashMap<String, WebSocketSession>();

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {

		sessions.remove(session.getId());

	}

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {

		sessions.put(session.getId(), session);

	}

	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		
		// TODO Aqui chega a mensagem do html
		// OnConected no javascript pega o usuário

		Set<String> sessionsIds = sessions.keySet();
		

		for (String id : sessionsIds) {

			sessions.get(id).sendMessage(new TextMessage(message.getPayload()));
			

		}

	}

}