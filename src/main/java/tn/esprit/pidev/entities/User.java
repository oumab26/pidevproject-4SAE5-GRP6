package tn.esprit.pidev.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)

public class User  implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String userName;

    private String LastName;

    private String email;

    private String password;

    private String country;

    private String adresse;
    private Boolean active;

    private int fonenumber;
    @Temporal(TemporalType.DATE)

    private Date DateOfBirth;

    private String educationlevel;

    private String job;

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<Role> roles;


    public User(Integer id, String email) {

        this.id=id;
        this.email=email;
    }
}