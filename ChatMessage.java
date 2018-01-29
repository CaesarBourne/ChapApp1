package com.caesar.ken.chapapp;

import java.util.Date;

/**
 * Created by e on 1/23/2018.
 */

public class ChatMessage {
    private String messageText;
    private  String messageUser;
    private long messageTime;

    public ChatMessage(String messageText, String mesageUser) {
        this.messageText = messageText;
        this.messageUser = mesageUser;

        messageTime = new Date().getTime();
    }

    public ChatMessage() {
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
      }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }
}
