package amr.ddd.Domain.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "thing")
public class Thing extends BaseEntity {

    @Column(name = "value")
    @Getter @Setter private String Value;

}
