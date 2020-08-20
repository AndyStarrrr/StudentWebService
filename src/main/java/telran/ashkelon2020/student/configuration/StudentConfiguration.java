package telran.ashkelon2020.student.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import telran.ashkelon2020.student.service.messaging.ViberMessaging;

@Configuration
public class StudentConfiguration {
	
	@Bean
	public ViberMessaging getViberMessaging() {
		return new ViberMessaging();
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
