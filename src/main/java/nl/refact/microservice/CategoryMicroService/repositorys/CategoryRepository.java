package nl.refact.microservice.CategoryMicroService.repositorys;


import nl.refact.microservice.CategoryMicroService.models.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
