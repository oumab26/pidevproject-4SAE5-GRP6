package tn.esprit.pidev.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

enum womenRole {
    Student,Condidate,Lerner
}
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Women  extends User {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idWomen;
    private String statusCondidacy;
    @Enumerated(EnumType.STRING)
    private womenRole womenRole ;
    private String linkedIn;
    private String resume;
    private String image;
/* Balti oumaima Offer*/

    @OneToMany(mappedBy="womenCondidacy",cascade = CascadeType. ALL )
    private Set<Condidacy> condid;
    /* Beldi Mona formation */

    @OneToMany(mappedBy="women")
    private Set<TrainerEvaluation> trainerEvaluations;


    @OneToMany(mappedBy="woman")
    private Set<Participation> participations;



    /* Khazri marwen  universities */

    @OneToMany(mappedBy="W")
    private Set<Request> requests;

}
