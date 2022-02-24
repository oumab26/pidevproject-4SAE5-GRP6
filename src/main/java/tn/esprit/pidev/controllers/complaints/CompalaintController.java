package tn.esprit.pidev.controllers.complaints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pidev.entities.*;
import tn.esprit.pidev.services.complaints.ComplaintServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController

public class CompalaintController {


    @Autowired
    private ComplaintServiceImpl compService;

    //affichage
    @GetMapping("/Complaints")
    public List<Complaint> getAllComplaint() {
        return compService.findAllComplaint();

    }


    //add
    @PostMapping("/Complaints/Add")

    public void save(@RequestBody Complaint complaint) {
        compService.save(complaint);

    }

    //update
    @PutMapping("/Complaints/Update")
    private Complaint update(@RequestBody Complaint complaint) {
        compService.save(complaint);
        return complaint;
    }

    //findbyid
    @DeleteMapping("/Complaintsdelete/{ComplaintId}")
    private void delete(@PathVariable("ComplaintId") int ComplaintId) {
        compService.delete(ComplaintId);
    }
    //findbyid

    @GetMapping("/Complaints/{ComplaintId}")
    private Optional<Complaint> getComplaint(@PathVariable("ComplaintId") int ComplaintId) {
        return compService.findById(ComplaintId);
    }

}
