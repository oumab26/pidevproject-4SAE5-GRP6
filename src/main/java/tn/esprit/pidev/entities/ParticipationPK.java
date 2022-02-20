package tn.esprit.pidev.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable // attributs will migrate as composed Key
public class ParticipationPK implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name="training_id")
    private int trainingId;
    @Column(name="id")
    private int id;

    //----------------Getters-Setters-------------

}
