package guru.springframework.petclinic.model;

/**
 * Created by at on on 23-Aug-19.
 */
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
