package tn.esprit.pidev.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Participation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int participationId;
    private String evalComment;
    private int worning = 0;
    private int certificatNumber;
    private float quizResult; // result after answering quiz

    @ManyToOne
    @JsonIgnore
    private Training trai;

     @ManyToOne
    @JsonIgnore
    private Women woman;



}
