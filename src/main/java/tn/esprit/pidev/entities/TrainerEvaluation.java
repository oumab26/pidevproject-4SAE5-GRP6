package tn.esprit.pidev.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TrainerEvaluation implements Serializable {

    private static final long serialVersionUID = 1L;
    /*  @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private int trainerEvaluationId;*/
    @EmbeddedId
    private TrainerEvaluationPK trainerEvaluationPK;
    private int score;

    /*@ManyToOne
    @JsonIgnore
    private Trainer trainerEv;

    @ManyToOne
    @JsonIgnores
    private Women women;*/

    @ManyToOne
    @JsonIgnore
    @MapsId("id")

    @JoinColumn(name = "id")
    private Women women;
    @ManyToOne
    @JsonIgnore
    @MapsId("trainerId")

    @JoinColumn(name= "trainer_id")
    private Trainer trainerEv;


}
