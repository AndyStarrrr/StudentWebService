package telran.ashkelon2020.student.service.messaging;

import org.springframework.stereotype.Component;

import telran.ashkelon2020.student.dto.MessageDto;
import telran.ashkelon2020.student.service.MessagingService;

@Component
public class WhatsAppMessaging implements MessagingService {

	@Override
	public MessageDto sendMessage(String message) {
		return MessageDto.builder()
				.messager("WhatsApp")
				.payload(message)
				.build();
	}

}
