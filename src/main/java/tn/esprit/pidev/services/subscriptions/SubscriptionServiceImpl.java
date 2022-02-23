package tn.esprit.pidev.services.subscriptions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.pidev.entities.Subscription;
import tn.esprit.pidev.repositories.SubscriptionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SubscriptionServiceImpl implements ISubscriptionServices {
    @Autowired
    private SubscriptionRepository subRepo ;


    @Override
    public List<Subscription> findAllSubscrpition() {
        return subRepo.findAll();
    }

    @Override
    public void save(Subscription subscription) {
        subRepo.save(subscription);


    }

    @Override
    public Optional<Subscription> findById(int idSub) {
        return subRepo.findById(idSub);
    }

    @Override
    public void delete(int idSub) {
        subRepo.deleteById(idSub);
    }

    @Override
    public void update(Subscription subscription) {
        subRepo.save(subscription);
    }
}

