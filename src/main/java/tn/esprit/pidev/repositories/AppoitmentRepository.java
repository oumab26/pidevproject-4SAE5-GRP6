package tn.esprit.pidev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pidev.entities.Appoitment;

@Repository

public interface AppoitmentRepository extends JpaRepository<Appoitment, Integer> {
}
