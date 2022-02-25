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

    //add
    @PostMapping("/Interview/Add")

    public void save(@RequestBody Interview interview){
        interviewService.save(interview);

    }


    //update
    @PutMapping("/Interview/Update")
    private Interview update(@RequestBody Interview interv)
    {
        interviewService.save(interv);
        return interv;
    }



    //delete
    @DeleteMapping("/Interviewdelete/{idInterview}")
    private void deleteInterv(@PathVariable("idInterview") int idInterview)
    {

        interviewService.delete(idInterview);
    }



    //findbyid
    @GetMapping("/Interview/{idInterview}")
    private Optional<Interview> getInterv(@PathVariable("idInterview") int   idInterview)
    {
        return  interviewService.findById(idInterview);
    }




}
