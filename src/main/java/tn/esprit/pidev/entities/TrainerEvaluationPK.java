package tn.esprit.pidev.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class TrainerEvaluationPK implements Serializable {
    @Column(name="id_women")
    private int idWomen;
    @Column(name="trainer_id")
    private int trainerId;
}
