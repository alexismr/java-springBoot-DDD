package amr.ddd.Infrastructure.Data;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import amr.ddd.Domain.Interfaces.repository.IRepository;


public class BaseRepositoryImpl <T, ID extends Serializable> extends SimpleJpaRepository<T, ID>  implements IRepository<T, ID> { 


    private final EntityManager entityManager;
 
    public BaseRepositoryImpl(Class<T> domainClass, EntityManager entityManager) {
        super(domainClass, entityManager);
        this.entityManager = entityManager;
    }
 
    @Transactional
    @Override
    public void  deleteById(ID id) {
        T deleted = entityManager.find(this.getDomainClass(), id);

 
  
            entityManager.remove(deleted);

        
   
    }
    
}
