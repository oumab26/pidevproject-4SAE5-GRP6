package tn.esprit.pidev.services.espace_offre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.pidev.entities.JobOffer;
import tn.esprit.pidev.repositories.JobOfferRepository;

import java.util.List;
import java.util.Optional;

@Service
public class JobOfferServiceImpl implements IJobOfferService{
    @Autowired
    private JobOfferRepository jobOfferRepository;



    public List<JobOffer> findAllJobOffer() {
        return (List<JobOffer>)jobOfferRepository.findAll();
    }


    public void save(JobOffer jobOffer) {
        jobOfferRepository.save(jobOffer);
    }
/**

    public JobOffer get(int id) {
        return jobOfferRepository.findById((long) id).get();
    }

    @Override
    public void delete(int id) {
        jobOfferRepository.deleteById((long) id);
    }






    @Override
    public void update(JobOffer jobOffer, int idOffer)
    {
        jobOfferRepository.save(jobOffer);
    }
**/
}
