package net.javabeat.springdata.data;



import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.gemfire.mapping.Region;

@Region("messages")
public class Message {
	@Id
	private String messageId;
	private String message;
	
	public Message() {
	}
	
	@PersistenceConstructor
	public Message(String id, String message) {
		this.messageId = id;
		this.message = message;
	}	
	

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
