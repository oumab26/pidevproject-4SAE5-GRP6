package tn.esprit.pidev.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
enum Domain {
    IT, PersonalDevelopment, SoftSkills, Finance
}
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Trainer extends User {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int trainerId;
    @Enumerated(EnumType.STRING)
    private Domain domain;

    @OneToMany(mappedBy="trainer")
    private Set<Training> trainings;

    @OneToMany(mappedBy="trainerEv")
    private Set<TrainerEvaluation> trainerEval;

}
