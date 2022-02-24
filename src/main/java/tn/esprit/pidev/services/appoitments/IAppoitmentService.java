package tn.esprit.pidev.services.appoitments;

import tn.esprit.pidev.entities.Appoitment;
import tn.esprit.pidev.entities.Subscription;

import java.util.List;
import java.util.Optional;

public interface IAppoitmentService {
    public List<Appoitment> findAllAppoitment();
    public void save(Appoitment appoitment);

    public Optional<Appoitment> findById(int AppoitmentId);
    public void delete(int AppoitmentId);
    public void update(Appoitment appoitment);
}
