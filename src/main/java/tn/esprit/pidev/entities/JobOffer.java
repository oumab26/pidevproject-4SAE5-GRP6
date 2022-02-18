package tn.esprit.pidev.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobOffer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOffer;
    private String titleOffer;
    private String description;
    @Temporal(TemporalType.DATE)
    private Date startDateoffer;
    @Temporal(TemporalType.DATE)
    private Date endDateoffer;
    private String addressOffer;
    private String company;
    private Boolean favorite;
    private String Status;


    @ManyToOne
    @JsonIgnore
    private Recuiter recruiter;

    @OneToOne
    private Interview interv;


    @OneToMany(mappedBy="jobOfferCon")
    private Set<Condidacy> condidacies;

}
