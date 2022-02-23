package tn.esprit.pidev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pidev.entities.Subscription;

@Repository

public interface SubscriptionRepository extends JpaRepository<Subscription, Integer> {
}
