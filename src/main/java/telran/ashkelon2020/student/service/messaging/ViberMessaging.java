package telran.ashkelon2020.student.service.messaging;

import telran.ashkelon2020.student.dto.MessageDto;
import telran.ashkelon2020.student.service.MessagingService;

public class ViberMessaging implements MessagingService {
	
	@Override
	public MessageDto sendMessage(String message) {
		return MessageDto.builder()
				.messager("Viber")
				.payload(message)
				.build();
	}
}
