package tn.esprit.pidev.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
enum Status {
    Accept,Refuse,OnHold
}
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Condidacy implements Serializable {
    @EmbeddedId
    private CondidacyPK condidacyPK;

    private Status status;
    @Temporal(TemporalType.DATE)
    private Date dateCondidacy;

    @ManyToOne
    @JsonIgnore
    @MapsId("id")

    @JoinColumn(name="id")
    private Women womenCondidacy;
    @ManyToOne
    @JsonIgnore
    @MapsId("idOffer")

    @JoinColumn(name="id_Offer")
    private JobOffer jobOfferCon;

}
