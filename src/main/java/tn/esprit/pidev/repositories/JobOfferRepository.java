package tn.esprit.pidev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pidev.entities.JobOffer;

@Repository
public interface  JobOfferRepository extends JpaRepository<JobOffer, Long> {



}
