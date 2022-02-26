package tn.esprit.pidev.services.espace_offre;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import tn.esprit.pidev.entities.Interview;
import tn.esprit.pidev.entities.User;

import java.util.Collection;
import java.util.List;

@Service
public class MailService {


    private  JavaMailSender  javaMailSender;


    @Autowired
    public MailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }



public  void sendEmail(User user, Interview inter) throws MailException
{


    SimpleMailMessage mail = new SimpleMailMessage();
    mail.setFrom("balti.oumaima@esprit.tn");
    mail.setTo(user.getEmail());
    mail.setSubject("Offre Emploi Accepter avec la date: "+inter.getDate());

    mail.setText("Votre condidature accepter\n "+inter.getTitle()+"\n link meet : \n" +
            "    "+inter.getLink()+"\n Date: "+inter.getDate()+"\n Time: "+inter.getTime()+"\n Num Tel: "+inter.getNumTel()+"\n Email:"+inter.getMail()+"\n Website:"+inter.getWebSite()+"\n Description:"+inter.getDescription());

    /*
     * This send() contains an Object of SimpleMailMessage as an Parameter
     */
    javaMailSender.send(mail);




}



}
