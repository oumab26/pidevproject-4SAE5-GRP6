package tn.esprit.pidev.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;
import javax.persistence.CascadeType;



import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Admin  extends User implements Serializable {
    private String Name_Admin;
    @OneToMany (cascade = CascadeType.ALL,mappedBy = "Admin")
    private Set<Complaint> complaints;
}
