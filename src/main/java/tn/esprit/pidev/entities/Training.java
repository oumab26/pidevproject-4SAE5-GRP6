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
public class Training implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int trainingId;
    private String label;
    private String description;
    @Enumerated(EnumType.STRING)
    private Domain domain;
    private Date beginDate;
    private Date endDate;

    @ManyToOne
    @JsonIgnore
    private Trainer trainer;

    @OneToMany(mappedBy="trai")
    private Set<Participation> partic;

    @OneToOne
    private Quiz quiz;



}
