package tn.esprit.pidev.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

enum StudyType
{
    FULLTIME,PARTTIME
}
enum StudyLanguage
{
    ENGLISH,FRENCH,SPANISH,ARABIC,GERMAN,RUSSIAN,ITALIAN
}
enum LearningType
{
    OnCampus,Online
}
enum StudyDomain {
    IT,EDUCATION,FINANCE,MECHANICAL
}
@Entity
@Table(name="UniversityOffer")
public class UniversityOffer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdUniversityOffer")
    private Long IdUniversityOffer;
    private String UniversityName;
    private String Location;
    private int Duration;
    private float TuitionFee;
    @Temporal(TemporalType.DATE)
    private Date StartDate;
    @Enumerated(EnumType.STRING)
    private StudyType Type;
    @Enumerated(EnumType.STRING)
    private StudyDomain Domain;
    @Enumerated(EnumType.STRING)
    private StudyLanguage Language;
    private LearningType LearnType;
    private String Image;
    @ElementCollection
    private List<Integer> Rating;
    private String Description;
    @Enumerated(EnumType.STRING)
    private StudyLanguage Lang;

    @ManyToOne
    @JsonIgnore
    private Representative   representative;

    @OneToMany(mappedBy="universityOf")
    private Set<Request> request;



}
