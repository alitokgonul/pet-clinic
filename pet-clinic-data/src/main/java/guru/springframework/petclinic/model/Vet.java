package guru.springframework.petclinic.model;

import java.util.Set;

/**
 * Created by at on on 14-Aug-19.
 */
public class Vet extends Person {

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
