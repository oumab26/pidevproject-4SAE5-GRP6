package tn.esprit.pidev.entities;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class User  implements Serializable {

    private static final long serialVersionUID = 1L;
    @NotNull
    @NotEmpty
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @NotEmpty
    private String userName;
    @NotNull
    @NotEmpty
    private String LastName;
    @NotNull
    @NotEmpty
    private String email;
    @NotNull
    @NotEmpty
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


}
