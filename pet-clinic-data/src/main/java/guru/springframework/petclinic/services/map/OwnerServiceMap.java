package guru.springframework.petclinic.services.map;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.services.CrudService;

import java.util.Set;

/**
 * Created by at on on 17-Aug-19.
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }
}
