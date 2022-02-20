package tn.esprit.pidev.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
enum Role  { Admin , Women ,Recruiter ,Expert, Trainer ,Representative

    }



@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)

public abstract  class User  implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String FirstName;

    private String LastName;

    private String email;

    private String password;

    private String country;

    private String adresse;

    private int fonenumber;
    @Temporal(TemporalType.DATE)

    private Date DateOfBirth;

    private String educationlevel;

    private String job;
    @Enumerated(EnumType.STRING)
    private Role role ;


}
