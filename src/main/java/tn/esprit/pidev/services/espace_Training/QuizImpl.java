package tn.esprit.pidev.services.espace_Training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.pidev.entities.Quiz;
import tn.esprit.pidev.repositories.QuizRepository;

import java.util.List;
import java.util.Optional;

@Service
public class QuizImpl implements IQuizService{

    @Autowired
    private QuizRepository quizRepository;
    @Override
    public List<Quiz> findAllQuiz() {
        return (List<Quiz>) quizRepository.findAll(); //-------------voir en cas de prob
    }

    @Override
    public void save(Quiz quiz) {
        quizRepository.save(quiz);
    }

    @Override
    public Optional<Quiz> findById(int QuizId) {
        return quizRepository.findById(QuizId);
    }

    @Override
    public void delete(int QuizId) {
        quizRepository.deleteById(QuizId);

    }

    @Override
    public void update(Quiz quiz) {
        quizRepository.save(quiz);

    }








}


