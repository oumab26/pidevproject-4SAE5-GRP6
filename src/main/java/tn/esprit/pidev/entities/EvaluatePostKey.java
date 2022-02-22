package tn.esprit.pidev.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * EvaluatePostKey is a class which represent te key of the evaluate_post class
 * @author Samti Med Wael
 *
 */
@Embeddable
public class EvaluatePostKey implements Serializable {


    @Column(name="post_id")
    private Long postId;
    @Column(name="user_id")
    private int userId;
    @Temporal(TemporalType.DATE)
    private Date interactionDate;


}
