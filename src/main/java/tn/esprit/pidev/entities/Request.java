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
public class Request implements Serializable {

    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRequest;*/

    @EmbeddedId
    private RequestPK requestPK;
    private String Cv;
    private String Message;
   /* @ManyToOne
    @JsonIgnore
    private UniversityOffer universityOf;

    @ManyToOne
    @JsonIgnore
    private Women W;*/

    @ManyToOne
    @JsonIgnore
    @MapsId("IdUniversityOffer")
    @JoinColumn(name = "IdUniversityOffer")
    private UniversityOffer universityOf;
    @ManyToOne
    @JsonIgnore
    @MapsId("id")
    @JoinColumn(name="id")
    private  Women W;

}
