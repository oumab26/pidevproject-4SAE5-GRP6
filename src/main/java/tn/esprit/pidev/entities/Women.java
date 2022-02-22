package tn.esprit.pidev.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

enum womenRole {
    Student,Condidate,Lerner }
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Women  extends User implements Serializable {

    private String statusCondidacy;
    @Enumerated(EnumType.STRING)
    private womenRole womenRole ;
    private String linkedIn;
    private String resume;
    private String image;
/* Balti oumaima Offer*/

    @OneToMany(mappedBy="womenCondidacy",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<Condidacy> condid;
    /* Beldi Mona formation */

    @OneToMany(mappedBy="women",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<TrainerEvaluation> trainerEvaluations;


    @OneToMany(mappedBy="woman",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<Participation> participations;



    /* Khazri marwen  universities */

    @OneToMany(mappedBy="W",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<Request> requests;
/*gouadria oumaima */
    @OneToMany (cascade = CascadeType.ALL,mappedBy = "Women")
    private Set<Complaint> complaints;

    @OneToOne
    private Subscription subscription;

}
