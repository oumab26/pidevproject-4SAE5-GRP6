package tn.esprit.pidev.services.espace_offre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.pidev.entities.Interview;
import tn.esprit.pidev.repositories.InterviewRepository;
import tn.esprit.pidev.repositories.JobOfferRepository;

import java.util.List;
import java.util.Optional;

@Service
public class InterviewServiceImpl implements IInterviewService{

    @Autowired
    private InterviewRepository interviewRepository;
    @Override
    public List<Interview> findAllInterview() {

        return interviewRepository.findAll();
    }

    @Override
    public void save(Interview interview) {

        interviewRepository.save(interview);
    }

    @Override
    public Optional<Interview> findById(int idInterview) {
        return interviewRepository.findById(idInterview);
    }

    @Override
    public void delete(int idInterview) {
        interviewRepository.deleteById(idInterview);
    }

    @Override
    public void update(Interview interview) {

        interviewRepository.save(interview);
    }
}
