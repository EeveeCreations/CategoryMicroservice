<<<<<<< HEAD:src/main/java/nl/refact/microservice/DAO/CategoryDAO.java
package nl.refact.microservice.DAO;

import nl.refact.microservice.model.Category;
import nl.refact.microservice.repository.CategoryRepository;
=======
package nl.refact.microservice.CategoryMicroService.dao;

import nl.refact.microservice.CategoryMicroService.repositorys.CategoryRepository;
import nl.refact.microservice.CategoryMicroService.models.Category;
>>>>>>> Bruteforcedeletingfromrefact:src/main/java/nl/refact/microservice/CategoryMicroService/dao/CategoryDAO.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Component
public class CategoryDAO {

    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryDAO(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAll() {
        ArrayList<Category> categories = (ArrayList<Category>) categoryRepository.findAll();
        categories.sort(Comparator.comparingLong(Category::getCategoryID));
        return categories;
    }

    public Optional<Category> getByIdOptional(long id) {
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        return optionalCategory;
    }

    public Category getById(long id) {
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        if (optionalCategory.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Category with the id: " + id + " not found");
        }
        return optionalCategory.get();
    }

    public Category addCategory(Category newCategory) {
        return categoryRepository.save(newCategory);
    }

    public void deleteCategory(long id) {
        categoryRepository.deleteById(id);
    }
}
