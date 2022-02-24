package tn.esprit.pidev.services.appoitments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.pidev.entities.Appoitment;
import tn.esprit.pidev.repositories.AppoitmentRepository;
import tn.esprit.pidev.repositories.SubscriptionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AppoitmentServiceImpl  implements IAppoitmentService{

    @Autowired
    private AppoitmentRepository appRepo ;
    @Override
    public List<Appoitment> findAllAppoitment() {
        return appRepo.findAll();
    }

    @Override
    public void save(Appoitment appoitment) {
        appRepo.save(appoitment);
    }

    @Override
    public Optional<Appoitment> findById(int AppoitmentId) {
        return appRepo.findById(AppoitmentId);
    }

    @Override
    public void delete(int AppoitmentId) {
        appRepo.deleteById(AppoitmentId);

    }

    @Override
    public void update(Appoitment appoitment) {
        appRepo.save(appoitment);

    }
}
