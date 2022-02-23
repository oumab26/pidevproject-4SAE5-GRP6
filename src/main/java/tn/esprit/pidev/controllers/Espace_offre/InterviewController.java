package tn.esprit.pidev.controllers.Espace_offre;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pidev.entities.Interview;
import tn.esprit.pidev.entities.JobOffer;
import tn.esprit.pidev.services.espace_offre.InterviewServiceImpl;
import tn.esprit.pidev.services.espace_offre.JobOfferServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
public class InterviewController {
    @Autowired
    private InterviewServiceImpl interviewService;


    //affichage
    @GetMapping("/Interview")
    public List<Interview> getAllInterview()
    {
        return interviewService.findAllInterview();

    }



}
