package guru.springframework.petclinic.services;

import guru.springframework.petclinic.model.Pet;

import java.util.Set;

/**
 * Created by at on on 14-Aug-19.
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
