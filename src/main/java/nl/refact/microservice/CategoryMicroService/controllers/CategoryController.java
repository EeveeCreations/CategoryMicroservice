<<<<<<< HEAD:src/main/java/nl/refact/microservice/controller/CategoryController.java
package nl.refact.microservice.controller;

import nl.refact.microservice.model.Category;
import nl.refact.microservice.DAO.CategoryDAO;
=======
package nl.refact.microservice.CategoryMicroService.controllers;

import nl.refact.microservice.CategoryMicroService.dao.CategoryDAO;
import nl.refact.microservice.CategoryMicroService.models.Category;
>>>>>>> Bruteforcedeletingfromrefact:src/main/java/nl/refact/microservice/CategoryMicroService/controllers/CategoryController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    public final CategoryDAO categoryDAO;

    public CategoryController(CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

    @GetMapping(value = "/category/all")
    public List<Category> getAllCategories() {
        return categoryDAO.getAll();
    }

    @GetMapping(value = "/category/{id}")
    public Category getCategory(@PathVariable final Long id) {
        return categoryDAO.getById(id);
    }

    @PutMapping(value = "/category/{id}")
    public Category editCategory(@RequestBody Category editCategory, @PathVariable Long id) throws Exception {

        return categoryDAO.getByIdOptional(id)
                .map(category -> {
                    category.setName(editCategory.getName());
                    category.setDescription(editCategory.getDescription());
                    return categoryDAO.addCategory(category);
                })
                .orElseThrow(() -> new Exception(
                        "No category found with id " + id + "\""));
    }

    @PutMapping(value = "/category")
    public Category addCategory(@RequestBody Category newCategory) {
        return categoryDAO.addCategory(newCategory);
    }

    @DeleteMapping("/category/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryDAO.deleteCategory(id);
    }
}
