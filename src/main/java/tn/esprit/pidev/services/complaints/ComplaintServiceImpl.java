package tn.esprit.pidev.services.complaints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.pidev.entities.Complaint;
import tn.esprit.pidev.entities.Subscription;
import tn.esprit.pidev.repositories.ComplaintRepository;
import tn.esprit.pidev.repositories.SubscriptionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ComplaintServiceImpl implements IComplaintService {
    @Autowired
    ComplaintRepository CompRepo ;

    @Override
    public List<Complaint> findAllComplaint() {
        return CompRepo.findAll();
    }

    @Override
    public void save(Complaint complaint) {
        CompRepo.save(complaint);

    }

    @Override
    public Optional<Complaint> findById(int ComplaintId) {
        return CompRepo.findById(ComplaintId);
    }


    @Override
    public void delete(int ComplaintId) {

        CompRepo.deleteById(ComplaintId);
    }

    @Override
    public void update(Complaint complaint) {
        CompRepo.save(complaint);

    }
}
