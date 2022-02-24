package tn.esprit.pidev.services.complaints;

import tn.esprit.pidev.entities.Complaint;
import tn.esprit.pidev.entities.Subscription;

import java.util.List;
import java.util.Optional;

public interface IComplaintService {
    public List<Complaint> findAllComplaint();
    public void save(Complaint  complaint);

    public Optional<Complaint> findById(int id);
    public void delete(int id);
    public void update(Complaint complaint);
}
