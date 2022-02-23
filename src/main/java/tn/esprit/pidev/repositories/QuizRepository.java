package tn.esprit.pidev.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pidev.entities.Quiz;

@Repository
public interface QuizRepository extends CrudRepository<Quiz, Integer> {
}
