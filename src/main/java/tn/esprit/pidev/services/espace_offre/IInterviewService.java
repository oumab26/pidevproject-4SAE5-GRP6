package tn.esprit.pidev.services.espace_offre;

import tn.esprit.pidev.entities.Interview;
import tn.esprit.pidev.entities.JobOffer;

import java.util.List;
import java.util.Optional;

public interface IInterviewService {

    public List<Interview> findAllInterview();
    public void save(Interview interview);
    public Optional<Interview> findById(int idInterview);
    public void delete(int idInterview);
    public void update(Interview interview);

}
