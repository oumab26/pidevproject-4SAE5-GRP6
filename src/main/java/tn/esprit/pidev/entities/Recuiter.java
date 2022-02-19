package tn.esprit.pidev.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Recuiter   extends User {




    private String name_Society;
    @OneToMany(cascade = CascadeType. ALL ,mappedBy="recruiter")
    private Set<JobOffer> job_Offers;

}
