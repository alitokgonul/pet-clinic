package guru.springframework.petclinic.services;

import guru.springframework.petclinic.model.Owner;

/**
 * Created by at on on 14-Aug-19.
 */
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
