package tn.esprit.pidev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tn.esprit.pidev.entities.Domaine;
import tn.esprit.pidev.entities.JobOffer;

import java.util.List;

@Repository
public interface  JobOfferRepository extends JpaRepository<JobOffer, Integer> {


    @Query("SELECT p FROM JobOffer p WHERE p.titleOffer  LIKE %?1%"
            + " OR p.addressOffer LIKE %?1%"
            + " OR p.company LIKE %?1%")

    public List<JobOffer> search(String keyword);


    public List<JobOffer> findByDomaine(Domaine domaine);



}
