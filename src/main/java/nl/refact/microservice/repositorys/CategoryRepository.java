package nl.refact.microservice.repositorys;

import nl.refact.microservice.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
