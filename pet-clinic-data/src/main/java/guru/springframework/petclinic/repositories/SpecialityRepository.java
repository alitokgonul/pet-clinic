package guru.springframework.petclinic.repositories;

import guru.springframework.petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by at on on 06-Sep-19.
 */
public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
