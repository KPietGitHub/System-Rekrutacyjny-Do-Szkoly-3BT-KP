package utilities;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Message {
    private String sender;
    private String recipient;
    private String content;
    private String timestamp;

    public Message(String sender, String recipient, String content) {
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
        this.timestamp = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public void displayMessage() {
        System.out.println("[" + timestamp + "] From: " + sender + " To: " + recipient);
        System.out.println("Message: " + content);
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}