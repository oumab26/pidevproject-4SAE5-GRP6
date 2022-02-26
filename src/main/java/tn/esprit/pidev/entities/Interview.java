package tn.esprit.pidev.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

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
    @Temporal(TemporalType.DATE)
    private Date date;
    @Temporal(TemporalType.TIME)
    private Date time;
    private  String link;



    @OneToOne(mappedBy = "interv")
    private JobOffer  joboffer;




    public Interview(String link, Integer idInterview, java.sql.Date date, String mail, String description, String title, Time time,String webSite,Integer numTel) {
        this.link=link;
        this.idInterview=idInterview;
        this.date=date;
        this.mail=mail;
        this.description=description;
        this.title=title;
        this.time=time;
        this.webSite=webSite;
        this.numTel=numTel;



    }
}
