package tn.esprit.pidev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pidev.entities.Training;

@Repository
public interface TrainingRepository extends JpaRepository<Training, Integer> {
}
