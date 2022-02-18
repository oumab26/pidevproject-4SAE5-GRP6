package tn.esprit.pidev.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Interview implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInterview;
    private String title;
    private String description;
    private int numTel;
    private String mail;
    private String webSite;
    private String date;
    private Time time;
    private  String link;



    @OneToOne(mappedBy = "interv")
    private JobOffer  joboffer;

}
