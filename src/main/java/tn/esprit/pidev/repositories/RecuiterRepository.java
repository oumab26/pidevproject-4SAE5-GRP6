package tn.esprit.pidev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pidev.entities.Recuiter;

@Repository
public interface RecuiterRepository extends JpaRepository<Recuiter, Integer> {


}
