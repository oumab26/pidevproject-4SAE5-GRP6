package tn.esprit.pidev.services.espace_Training;

import tn.esprit.pidev.entities.Quiz;

import java.util.List;
import java.util.Optional;

public interface IQuizService {
    public List<Quiz> findAllQuiz();
    public void save(Quiz quiz);
    public Optional<Quiz> findById(int QuizId);
    public void delete(int QuizId);
    public void update(Quiz quiz);
}
