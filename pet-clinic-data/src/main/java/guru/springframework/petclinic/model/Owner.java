package guru.springframework.petclinic.model;

import java.util.Set;

/**
 * Created by at on on 14-Aug-19.
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
