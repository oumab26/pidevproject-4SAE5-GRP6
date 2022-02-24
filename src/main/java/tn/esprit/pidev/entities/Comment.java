package tn.esprit.pidev.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
/**
 * Message is an entity which represent the Message table
 * @author Samti Med Wael
 *
 */

@Entity
public class Comment implements Serializable {


    /**
     * The Message Id
     */

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String commentId ;

    /**
     * The Comment content
     */
    @Lob
    private byte[] commentContent;


    private String CommentContentType;


    public String getCommentContentType() {
        return CommentContentType;
    }

    public void setCommentContentType(String commentContentType) {
        CommentContentType = commentContentType;
    }

    public Comment() {
    }

    /**
     * @return the comment Id
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * @param commentId the commentId to set
     */

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }
    /**
     * @return the comment Content
     */
    public byte[] getCommentContent() {
        return commentContent;
    }

    /**
     * @param commentContent the commentContent to set
     */
    public void setCommentContent(byte[] commentContent) {
        this.commentContent = commentContent;
    }
}
