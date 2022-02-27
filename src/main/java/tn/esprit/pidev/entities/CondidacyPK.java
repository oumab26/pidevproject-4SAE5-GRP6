package tn.esprit.pidev.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Embeddable
public class CondidacyPK implements Serializable {
     @Column(name="id_offer")
    private int idOffer;
    @Column(name="id")
    private int id;

  
}
