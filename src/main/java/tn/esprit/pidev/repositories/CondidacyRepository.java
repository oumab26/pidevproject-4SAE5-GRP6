package tn.esprit.pidev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pidev.entities.Condidacy;

@Repository
public interface CondidacyRepository extends JpaRepository<Condidacy, Long> {



}
