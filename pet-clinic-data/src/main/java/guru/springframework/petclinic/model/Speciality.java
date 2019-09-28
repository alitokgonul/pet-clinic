package guru.springframework.petclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by at on on 23-Aug-19.
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {

    @Column(name = "description")
    private String description;
}
