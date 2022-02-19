package tn.esprit.pidev.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
enum ExpertRole {
    Medecin , Avocat, Sociologue, Psycologue
}
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Expert  extends User {
    @Enumerated(EnumType.STRING)
    private ExpertRole expertrole ;

    @OneToMany (cascade = CascadeType.ALL,mappedBy = "Women")
    private Set<Appoitment> appoitments;
}
