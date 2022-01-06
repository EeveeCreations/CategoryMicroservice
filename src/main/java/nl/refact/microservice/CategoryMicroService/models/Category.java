<<<<<<< HEAD:src/main/java/nl/refact/microservice/model/Category.java
package nl.refact.microservice.model;
=======
package nl.refact.microservice.CategoryMicroService.models;
>>>>>>> Bruteforcedeletingfromrefact:src/main/java/nl/refact/microservice/CategoryMicroService/models/Category.java

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long categoryID;

    private String name;
    private String description;

    public Category(Long categoryID, String name, String description) {
        this.categoryID = categoryID;
        this.name = name;
        this.description = description;
    }

    public Category() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategoryID(Long categoryID) {
        this.categoryID = categoryID;
    }

    public Long getCategoryID() {
        return categoryID;
    }
}
