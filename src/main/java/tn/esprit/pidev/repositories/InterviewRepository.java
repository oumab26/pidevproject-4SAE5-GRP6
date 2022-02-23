package tn.esprit.pidev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pidev.entities.Interview;

@Repository
public interface InterviewRepository extends JpaRepository<Interview, Integer> {


}
