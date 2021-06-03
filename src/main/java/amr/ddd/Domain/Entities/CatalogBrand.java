package amr.ddd.Domain.Entities;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "catalogBrand")
public class CatalogBrand extends BaseEntity  {

    @Column(name = "brand")
    @Getter @Setter public String Brand;


}
