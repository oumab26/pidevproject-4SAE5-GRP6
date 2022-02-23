package tn.esprit.pidev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pidev.entities.QuizQuestion;

@Repository
public interface QuizQuestionRepository  extends JpaRepository<QuizQuestion, Integer> {
}
