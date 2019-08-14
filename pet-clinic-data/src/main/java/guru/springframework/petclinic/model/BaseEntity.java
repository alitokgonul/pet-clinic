package guru.springframework.petclinic.model;

import java.io.Serializable;

/**
 * Created by at on on 14-Aug-19.
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
