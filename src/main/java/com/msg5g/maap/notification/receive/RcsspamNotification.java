package com.msg5g.maap.notification.receive;

import java.util.List;
@SuppressWarnings("unused")
public class RcsspamNotification {
    private List<String> messageId;
    private String spamType;
    private String freeText;

    public List<String> getMessageId() {
        return messageId;
    }

    public void setMessageId(List<String> messageId) {
        this.messageId = messageId;
    }

    public String getSpamType() {
        return spamType;
    }

    public void setSpamType(String spamType) {
        this.spamType = spamType;
    }

    public String getFreeText() {
        return freeText;
    }

    public void setFreeText(String freeText) {
        this.freeText = freeText;
    }
}
