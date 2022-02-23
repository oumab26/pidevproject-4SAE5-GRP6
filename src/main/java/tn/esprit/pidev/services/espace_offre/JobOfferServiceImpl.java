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


    @Override
    public List<JobOffer> findAllJobOffer() {
        return jobOfferRepository.findAll();

    }

    @Override
    public void save(JobOffer jobOffer) {

        jobOfferRepository.save(jobOffer);
    }

    @Override
    public Optional<JobOffer> findById(int idOffer) {


        return jobOfferRepository.findById(idOffer);
    }



    @Override
    public void delete(int idOffer)
    {
        jobOfferRepository.deleteById(idOffer);
    }

    @Override
    public void update(JobOffer jobOffer) {

        jobOfferRepository.save(jobOffer);

    }

}
