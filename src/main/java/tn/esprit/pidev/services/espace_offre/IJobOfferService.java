package tn.esprit.pidev.services.espace_offre;

import tn.esprit.pidev.entities.Domaine;
import tn.esprit.pidev.entities.JobOffer;

import java.util.List;
import java.util.Optional;



    public interface IJobOfferService {


        public List<JobOffer> findAllJobOffer();
        public void save(JobOffer jobOffer);
        public Optional<JobOffer> findById(int idOffer);
        public void delete(int idOffer);
        public void update(JobOffer jobOffer);
        public Iterable<JobOffer> listAllSearch(String keyword);
        public List<JobOffer> findByDomaine(Domaine domaine);



}
