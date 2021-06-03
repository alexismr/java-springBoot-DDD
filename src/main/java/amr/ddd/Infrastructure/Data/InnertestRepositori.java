package amr.ddd.Infrastructure.Data;
import org.springframework.data.jpa.repository.JpaRepository;


import amr.ddd.Domain.Entities.CatalogType;

public interface InnertestRepositori extends JpaRepository<CatalogType, Integer> {

    
} 