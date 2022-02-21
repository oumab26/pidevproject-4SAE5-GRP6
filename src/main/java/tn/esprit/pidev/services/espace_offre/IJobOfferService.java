package tn.esprit.pidev.services.espace_offre;

import tn.esprit.pidev.entities.JobOffer;

import java.util.List;

public interface IJobOfferService {


    public List<JobOffer> findAllJobOffer();

    public void save(JobOffer jobOffer);

    /**
    public JobOffer get(int id);

    public void delete(int id);
    public void update(JobOffer jobOffer, int idOffer);
**/


}
