package amr.ddd.Domain.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "catalogItem")
public class CatalogItem  extends BaseEntity{

    @Column(name = "name" , length = 20, nullable = false)
    public String Name;

    @Column(name = "description")
    public String Description;

    @Column(name = "price")   
    public BigDecimal Price;

    @Column(name = "pictureUri")   
    public String PictureUri;


    @ManyToOne 
    private CatalogType CatalogType;
    @ManyToOne 
    private CatalogBrand CatalogBrand;

}
