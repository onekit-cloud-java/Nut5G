package com.msg5g.maap.request;

import java.util.List;
@SuppressWarnings({"unused", "FieldCanBeLocal"})
public class MessagesrevokeRequest {
    private String messageId;
    private final String status = "RevokeRequested";
    private List<String> destinationAddress;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getStatus() {
        return status;
    }

    public List<String> getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(List<String> destinationAddress) {
        this.destinationAddress = destinationAddress;
    }
}
