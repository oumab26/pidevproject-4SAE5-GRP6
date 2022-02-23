package tn.esprit.pidev.services.subscriptions;

import tn.esprit.pidev.entities.JobOffer;
import tn.esprit.pidev.entities.Subscription;

import java.util.List;
import java.util.Optional;

public interface ISubscriptionServices {
    public List<Subscription> findAllSubscrpition();
    public void save(Subscription subscription);

    public Optional<Subscription> findById(int idSub);
    public void delete(int idSub);
    public void update(Subscription subscription);
}

