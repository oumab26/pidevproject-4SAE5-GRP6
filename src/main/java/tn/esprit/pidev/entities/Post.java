package tn.esprit.pidev.entities;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 * Post is an entity wich represent the post table
 * @author Samti Med Wael
 *
 */
public class Post implements Serializable {


    /**
     * The id of the post
     */
    private Long postId;
    /**
     * The post title
     */
    private String postTitle;
    /**
     * The creation date of the post
     */
    @Temporal(TemporalType.DATE)
    private Date postCreationDate;
    /**
     * The updating date of the post
     */
    @Temporal(TemporalType.DATE)
    private Date postUpdateDate;
    /**
     * The post content (String|Image|Video...)
     */
    private Byte[] postContent;
    /**
     * The number of likes for this post
     */
    private int nbLikes;
    /**
     * The Category which the post is belonging to
     */
    @Enumerated(EnumType.STRING)
    private Category postCategory;


    /**
     * @return the post Id
     */
    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }
    /**
     * @return the post Title
     */
    public String getPostTitle() {
        return postTitle;
    }
    /**
     * @param postTitle the postTitle to set
     */
    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }
    /**
     * @return get post's creation date
     */
    public Date getPostCreationDate() {
        return postCreationDate;
    }
    /**
     * @param postCreationDate the postCreationDate to set
     */
    public void setPostCreationDate(Date postCreationDate) {
        this.postCreationDate = postCreationDate;
    }
    /**
     * @return get post's updating date
     */
    public Date getPostUpdateDate() {
        return postUpdateDate;
    }
    /**
     * @param postUpdateDate the postUpdateDate to set
     */
    public void setPostUpdateDate(Date postUpdateDate) {
        this.postUpdateDate = postUpdateDate;
    }
    /**
     * @return the post's content
     */
    public Byte[] getPostContent() {
        return postContent;
    }
    /**
     * @param postContent the postContent to set
     */
    public void setPostContent(Byte[] postContent) {
        this.postContent = postContent;
    }
    /**
     * @return get post's number of likes
     */
    public int getNbLikes() {
        return nbLikes;
    }
    /**
     * @param nbLikes the nbLikes to set
     */
    public void setNbLikes(int nbLikes) {
        this.nbLikes = nbLikes;
    }
    /**
     * @return get the post's category
     */
    public Category getPostCategory() {
        return postCategory;
    }
    /**
     * @param postCategory the postCategory to set
     */
    public void setPostCatgory(Category postCategory) {
        this.postCategory = postCategory;
    }
}
