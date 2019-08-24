package guru.springframework.petclinic.services;

import guru.springframework.petclinic.model.PetType;
import org.springframework.stereotype.Service;

/**
 * Created by at on on 23-Aug-19.
 */
@Service
public interface PetTypeService extends CrudService<PetType, Long> {
}
