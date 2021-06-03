package amr.ddd.Domain.Interfaces.repository;

import java.io.Serializable;
import org.springframework.data.repository.Repository;




public interface IRepository<T, ID extends Serializable> extends Repository<T, ID> {
 

}