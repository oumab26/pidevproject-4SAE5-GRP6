package tn.esprit.pidev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.pidev.entities.Condidacy;
import tn.esprit.pidev.entities.JobOffer;

import java.util.List;

@Repository
public interface CondidacyRepository extends JpaRepository<Condidacy,Integer> {



}
