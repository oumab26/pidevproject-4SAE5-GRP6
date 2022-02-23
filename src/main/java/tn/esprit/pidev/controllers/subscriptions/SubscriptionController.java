package tn.esprit.pidev.controllers.subscriptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pidev.entities.*;
import tn.esprit.pidev.entities.Subscription;
import tn.esprit.pidev.repositories.SubscriptionRepository;
import tn.esprit.pidev.services.subscriptions.SubscriptionServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController

public class SubscriptionController {
    @Autowired
    private SubscriptionServiceImpl subService;
    //affichage
    @GetMapping("/Subscriptions")
    public List<Subscription> getAllSubscription()
    {
        return subService.findAllSubscrpition();

    }


    //add
    @PostMapping("/Subscriptions/Add")

    public void save(@RequestBody Subscription subscription){
        subService.save(subscription);

    }
    //update
    @PutMapping("/Subscriptions/Update")
    private Subscription update(@RequestBody Subscription subscription)
    {
        subService.save(subscription);
        return subscription;
    }
    //findbyid
    @DeleteMapping("/Subscriptionsdelete/{idSub}")
    private void delete(@PathVariable("idSub") int idSub)
    {
        subService.delete(idSub);
    }
    //findbyid
    @GetMapping("/Subscriptions/{idSub}")
    private Optional<Subscription> getSubscription (@PathVariable("idSub") int idSub)
    {
        return subService.findById(idSub);
    }


}
