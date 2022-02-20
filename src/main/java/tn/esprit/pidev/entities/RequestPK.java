package tn.esprit.pidev.entities;

import javax.persistence.Column;
import java.io.Serializable;

public class RequestPK implements Serializable {
    @Column(name="id")
    private int id;
    @Column(name = "IdUniversityOffer")
    private Long IdUniversityOffer;
}
