package tn.esprit.pidev.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
public class RequestPK implements Serializable {
    @Column(name="id")
    private int id;
    @Column(name = "IdUniversityOffer")
    private Long IdUniversityOffer;
}
