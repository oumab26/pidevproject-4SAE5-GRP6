package tn.esprit.pidev.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Participation implements Serializable {

    private static final long serialVersionUID = 1L;
    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int participationId;*/

    @EmbeddedId
    private ParticipationPK participationPK;

    private String evalComment;
    private int worning = 0;
    private int certificatNumber;
    private float quizResult; // result after answering quiz

    /*@ManyToOne
    @JsonIgnore
    private Training trai;

     @ManyToOne
    @JsonIgnore
    private Women woman;*/

    @ManyToOne
    @JsonIgnore
    @MapsId("trainingId")

    @JoinColumn(name = "training_id")
    private Training trai;
    @ManyToOne
    @JsonIgnore
    @MapsId("id")

    @JoinColumn(name= "id")
    private  Women woman;

}
