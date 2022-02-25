package tn.esprit.pidev.services.espace_offre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.pidev.entities.Condidacy;
import tn.esprit.pidev.repositories.CondidacyRepository;
import tn.esprit.pidev.repositories.InterviewRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CondidacyServiceImpl implements ICondidacyService {
    @Autowired
    private CondidacyRepository condidacyRepository;

    @Override
    public List<Condidacy> findAllCondidacy() {
        return condidacyRepository.findAll();
    }

    @Override
    public void save(Condidacy condidacy) {
       condidacyRepository.save(condidacy);
    }



    @Override
    public void update(Condidacy condidacy) {
      condidacyRepository.save(condidacy);
    }
}
