package net.javabeat.springdata.bean;

import net.javabeat.springdata.data.Message;
import net.javabeat.springdata.repo.MessageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GemFireBean {
	
	MessageRepository messageRepository;
	
	public GemFireBean(){
	
	}

	public MessageRepository getMessageRepository() {
		return messageRepository;
	}
	
	@Autowired
	public void setMessageRepository(MessageRepository messageRepository) {
		// Message repository has been set
		this.messageRepository = messageRepository;
		
		// Add some messages into GemFire for being seen
		Message message = new Message();
		message.setMessageId("1");
		message.setMessage("Hello JavaBeat !");
		
		messageRepository.save(message);
		
		// Add 
		message = new Message();	
		message.setMessageId("2");
		message.setMessage("Hello GemFire REST");
		messageRepository.save(message);		
		System.out.println("Messages are filled");
	}

}
