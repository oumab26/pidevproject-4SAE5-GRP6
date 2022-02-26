package tn.esprit.pidev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import tn.esprit.pidev.entities.User;
import tn.esprit.pidev.services.espace_offre.MailService;

//@EnableWebMvc
//@EnableScheduling
@SpringBootApplication
public class Main {
    @Autowired
    private MailService senderService;

    public static void main(String[] args){
        SpringApplication.run(Main.class,args);

    }
/**
@EventListener(ApplicationReadyEvent.class)
    public void  senMail (User user){

        senderService.sendEmail(user);
}**/


}
