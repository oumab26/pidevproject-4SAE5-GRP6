package tn.esprit.pidev.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class EvaluatePost implements Serializable {
    @EmbeddedId
    private EvaluatePostKey evaluatePostKey;
    @Enumerated(EnumType.STRING)
    private Emoji emoji;
    @Enumerated(EnumType.STRING)
    private Rating rating;
    @ManyToOne
    @JsonIgnore
    @MapsId("userId")

    @JoinColumn(name = "user_id")
    private User postEvaluator;
    @ManyToOne
    @JsonIgnore
    @MapsId("postId")

    @JoinColumn(name= "post_id")
    private Post evaluatedPost;

    @OneToOne
    @JoinColumn(name = "comment_id")
    private Comment comment;


    public EvaluatePostKey getEvaluatePostKey() {
        return evaluatePostKey;
    }

    public void setEvaluatePostKey(EvaluatePostKey evaluatePostKey) {
        this.evaluatePostKey = evaluatePostKey;
    }

    public Emoji getEmoji() {
        return emoji;
    }

    public void setEmoji(Emoji emoji) {
        this.emoji = emoji;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public User getPostEvaluator() {
        return postEvaluator;
    }

    public void setPostEvaluator(User postEvaluator) {
        this.postEvaluator = postEvaluator;
    }

    public Post getEvaluatedPost() {
        return evaluatedPost;
    }

    public void setEvaluatedPost(Post evaluatedPost) {
        this.evaluatedPost = evaluatedPost;
    }
}
