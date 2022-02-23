package tn.esprit.pidev.controllers.Espace_Training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pidev.entities.Quiz;
import tn.esprit.pidev.services.espace_Training.QuizImpl;

import javax.servlet.annotation.WebServlet;
import java.util.List;
import java.util.Optional;

@WebServlet("/pidevBackEnd")
@RestController
public class QuizController {
    @Autowired
    private QuizImpl quizService;


    @GetMapping("/quizs")
    public List<Quiz> getAllQuiz()
    {
        //return quizService.findAllJobOffer();
        return quizService.findAllQuiz();

    }

    @PostMapping("/quizs/add")

    public void save(@RequestBody Quiz quiz){
        quizService.save(quiz);

    }

    @PutMapping("/quizs/update")
    private Quiz update(@RequestBody Quiz quiz)
    {
        quizService.save(quiz);
        return quiz;
    }

    @DeleteMapping("/quizs/delete/{QuizId}")
    private void deleteQuiz(@PathVariable("QuizId") int QuizId)
    {
        quizService.delete(QuizId);
    }

    //findbyid
    @GetMapping("/quizs/{QuizId}")
    private Optional<Quiz> getQuiz(@PathVariable("QuizId") int QuizId)
    {
        return quizService.findById(QuizId);
    }
}


