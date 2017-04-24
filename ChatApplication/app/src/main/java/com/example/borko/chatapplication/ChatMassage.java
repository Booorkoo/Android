package com.example.borko.chatapplication;

import java.util.Date;

/**
 * Created by Borko on 4/24/2017.
 */

public class ChatMassage {

    private String messageText;
    private String messageUser;
    private long messageTime;

    public ChatMassage(String messageText,String messageUser){
        this.messageText = messageText;
        this.messageUser = messageUser;

        messageTime = new Date().getTime();
    }

    public ChatMassage(){}

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }

    public String getMessageText() {

        return messageText;
    }

    public String getMessageUser() {
        return messageUser;
    }

    public long getMessageTime() {
        return messageTime;
    }
}
