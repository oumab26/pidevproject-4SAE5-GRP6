package tn.esprit.pidev.entities;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
/**
 * Message is an entity which represent the Message table
 * @author Samti Med Wael
 *
 */
public class Message implements Serializable {


    /**
     * The Message Id
     */
    private Long messageId;
    /**
     * The creation date of the Message
     */
    @Temporal(TemporalType.DATE)
    private Date messageCreationDate;
    /**
     * The content of the message
     */
    private String messageContent;

    /**
     * @return the Message Id
     */
    public Long getMessageId() {
        return messageId;
    }
    /**
     * @param messageId the messageId to set
     */
    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }
    /**
     * @return the Message creating Date
     */
    public Date getMessageCreationDate() {
        return messageCreationDate;
    }
    /**
     * @param messageCreationDate the messaheCreatingDate to set
     */
    public void setMessageCreationDate(Date messageCreationDate) {
        this.messageCreationDate = messageCreationDate;
    }
    /**
     * @return the Message Content
     */
    public String getMessageContent() {
        return messageContent;
    }
    /**
     * @param messageContent the messageContent to set
     */
    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }
}
