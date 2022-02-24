package tn.esprit.pidev.controllers.appoitments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pidev.entities.*;
import tn.esprit.pidev.repositories.*;
import tn.esprit.pidev.services.*;
import tn.esprit.pidev.services.appoitments.AppoitmentServiceImpl;
import tn.esprit.pidev.services.subscriptions.SubscriptionServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController

public class AppoitmentController {


    @Autowired
    private AppoitmentServiceImpl appService;

    //affichage
    @GetMapping("/Appoitments")
    public List<Appoitment> getAllAppoitment() {
        return appService.findAllAppoitment();

    }


    //add
    @PostMapping("/Appoitments/Add")

    public void save(@RequestBody Appoitment appoitment) {
        appService.save(appoitment);

    }

    //update
    @PutMapping("/Appoitments/Update")
    private Appoitment update(@RequestBody Appoitment appoitment) {
        appService.save(appoitment);
        return appoitment;
    }

    //findbyid
    @DeleteMapping("/Appoitmentsdelete/{AppoitmentId}")
    private void delete(@PathVariable("AppoitmentId") int AppoitmentId) {
        appService.delete(AppoitmentId);
    }
    //findbyid

    @GetMapping("/Appoitments/{AppoitmentId}")
    private Optional<Appoitment> getAppoitment(@PathVariable("AppoitmentId") int AppoitmentId) {
        return appService.findById(AppoitmentId);
    }

}