package Model.Database.Repository;

import java.util.ArrayList;

public class Category {
    private String name;
    private Category derivedCategory;
    private ArrayList<Category> subCategories;

    public Category(String name, Category derivedCategory) {
        this.name = name;
        this.derivedCategory = derivedCategory;
        this.subCategories = new ArrayList<Category>();
    }

    public String getName() {
        return name;
    }

    public Category getDerivedCategory() {
        return derivedCategory;
    }

    public ArrayList<Category> getSubCCategories() {
        return subCategories;
    }

    public void addSubCategory(Category category)
    {

    }
}
