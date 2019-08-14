package guru.springframework.petclinic.services;

import guru.springframework.petclinic.model.Vet;

import java.util.Set;

/**
 * Created by at on on 14-Aug-19.
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
