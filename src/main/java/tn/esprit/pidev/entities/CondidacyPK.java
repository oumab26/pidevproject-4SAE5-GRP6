package tn.esprit.pidev.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CondidacyPK implements Serializable {
     @Column(name="id_offer")
    private int idOffer;
    @Column(name="id")
    private int id;
}
