package tn.esprit.pidev.controllers.Espace_offre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprit.pidev.entities.Domaine;
import tn.esprit.pidev.entities.JobOffer;
import tn.esprit.pidev.repositories.JobOfferRepository;
import tn.esprit.pidev.services.espace_offre.JobOfferServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController

public class JobofferController {
    @Autowired
    private JobOfferServiceImpl jobService;
    private JobOfferRepository   jobOfferRepository;
//affichage
    @GetMapping("/Jobs")
    public List<JobOffer> getAllJobs()
    {
        return jobService.findAllJobOffer();

    }


//add
    @PostMapping("/Jobs/Add")

    public void save(@RequestBody JobOffer jobOffer){
         jobService.save(jobOffer);

    }

    //update
@PutMapping("/Jobs/Update")
private JobOffer update(@RequestBody JobOffer jobOffer)
{
    jobService.save(jobOffer);
    return jobOffer;
}


//delete
    @DeleteMapping("/Jobsdelete/{idOffer}")
    private void deleteJobs(@PathVariable("idOffer") int idOffer)
    {
        jobService.delete(idOffer);
    }



    //findbyid
    @GetMapping("/Jobs/{idOffer}")
    private Optional<JobOffer> getJobs(@PathVariable("idOffer") int   idOffer)
    {
        return  jobService.findById(idOffer);
    }




// search par title +   address  +  company
    @GetMapping("/Search/{keyword}")
    public List<JobOffer> search(@PathVariable("keyword") String keyword) {
        List<JobOffer> jb = new ArrayList<>();
       this.jobService.listAllSearch(keyword).forEach(jb::add);
       return jb;
    }



//search par  domaine
@GetMapping(value = "/Search/Domaine/{domaine}" )
    public  List<JobOffer> getJobByDomaine(@PathVariable("domaine") Domaine domaine) {
        return jobService.findByDomaine(domaine);

    }

}
