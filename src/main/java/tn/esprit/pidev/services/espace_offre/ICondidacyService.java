package tn.esprit.pidev.services.espace_offre;

import tn.esprit.pidev.entities.Condidacy;
import tn.esprit.pidev.entities.Interview;

import java.util.List;
import java.util.Optional;

public interface ICondidacyService {



    public List<Condidacy> findAllCondidacy();
    public void save(Condidacy condidacy);
 /**   public Optional<Condidacy> findById(int id,int id_Offer);
    public void delete(int id,int id_Offer);    **/
    public void update(Condidacy condidacy);

}
