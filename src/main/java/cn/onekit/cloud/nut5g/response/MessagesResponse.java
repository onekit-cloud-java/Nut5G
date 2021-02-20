package cn.onekit.cloud.nut5g.response;

import cn.onekit.cloud.nut5g.response.Nut5GResponse;

public class MessagesResponse extends Nut5GResponse {
    private String messageId;
    private String conversationId;
    private String contributionId;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public String getContributionId() {
        return contributionId;
    }

    public void setContributionId(String contributionId) {
        this.contributionId = contributionId;
    }
}