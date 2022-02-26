package tn.esprit.pidev.controllers.Espace_offre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pidev.entities.Condidacy;
import tn.esprit.pidev.entities.Interview;
import tn.esprit.pidev.entities.User;
import tn.esprit.pidev.repositories.CondidacyRepository;
import tn.esprit.pidev.services.espace_offre.CondidacyServiceImpl;
import tn.esprit.pidev.services.espace_offre.MailService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CondidacyController {
    @Autowired
    private CondidacyServiceImpl CondidacyService;
private CondidacyRepository  condidacyRepository;
    private MailService mailService;


    private User user;

    public CondidacyController (MailService mailService) {
        this.mailService = mailService;
    }


    //affichage
    @GetMapping("/Condidacy")
    public List<Condidacy> getAllCondidacy()
    {
        return CondidacyService.findAllCondidacy();

    }

    //add
    @PostMapping("/Condidacy/Add")

    public void save(@RequestBody Condidacy condidacy){
        CondidacyService.save(condidacy);

    }


    //update
    @PutMapping("/Condidacy/Update")
    private Condidacy update(@RequestBody Condidacy condidacy)
    {
       CondidacyService.save(condidacy);
        return condidacy;
    }


@RequestMapping("/email-success")
public String emailSuccess() {

    HashMap<Integer, User> map = DBQuery.getEmail();
    HashMap<Integer, Interview> map2 = DBQueryinterview.getLink();

    try {
        for(Map.Entry<Integer, User> m : map.entrySet()){
            for(Map.Entry<Integer, Interview>m2 : map2.entrySet()){
            User user = new User();
            Interview inter = new Interview();
            inter.setLink(m2.getValue().getLink());
                inter.setDate(m2.getValue().getDate());
                inter.setMail(m2.getValue().getMail());
                inter.setWebSite(m2.getValue().getWebSite());
                inter.setNumTel(m2.getValue().getNumTel());
                inter.setTime(m2.getValue().getTime());
                inter.setTitle(m2.getValue().getTitle());
                inter.setDescription(m2.getValue().getDescription());
            user.setEmail(m.getValue().getEmail());

            //check if all details are successfully fetched
            System.out.println("email:"+m.getValue().getEmail());

            // send email to all clients
            mailService.sendEmail(user,inter);
        }}
    }catch (MailException e) {
        e.printStackTrace();
    }
    return "email_processed";
}





/**
    @GetMapping("/id/id_offer")
    public ResponseEntity<List<Condidacy>> getIdAndIdOffer(@RequestParam Integer id,
                                                           @RequestParam Integer id_offer) {
        return new ResponseEntity<List<Condidacy>>(condidacyRepository.findByIdAndId_Offer(id,id_offer), HttpStatus.OK);
    }

**/



}
