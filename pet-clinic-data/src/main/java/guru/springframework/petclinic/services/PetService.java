package guru.springframework.petclinic.services;

import guru.springframework.petclinic.model.Pet;
import org.springframework.stereotype.Service;

/**
 * Created by at on on 14-Aug-19.
 */
@Service
public interface PetService extends CrudService<Pet, Long>{

}
