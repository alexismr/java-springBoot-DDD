package amr.ddd.Domain.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "catalogType")
public class CatalogType extends BaseEntity  {


    @Column(name = "type")
    @Getter @Setter  public String Type;


}
