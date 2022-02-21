package tn.esprit.pidev.controllers.Espace_offre;

import io.swagger.models.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pidev.entities.JobOffer;
import tn.esprit.pidev.services.espace_offre.JobOfferServiceImpl;
import java.util.List;

@RestController

public class JobofferController {
    @Autowired
    private JobOfferServiceImpl jobService;

    @GetMapping("/job")
    public List<JobOffer> getAllJobs()
    {
        return jobService.findAllJobOffer();
    }



    @PostMapping("/Jobs")

    public void save(@RequestBody JobOffer jobOffer){
         jobService.save(jobOffer);
    }
/**
    @GetMapping("/Jobs/{Jobsid}")
    private JobOffer getJobs(@PathVariable("idOffer") int idOffer)
    {
        return jobService.get(idOffer);
    }


    @DeleteMapping("/Jobs/{Jobsid}")
    private void deleteJobs(@PathVariable("idOffer") int idOffer)
    {
        jobService.delete(idOffer);
    }

**/


}
