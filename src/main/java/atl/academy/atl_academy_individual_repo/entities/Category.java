package atl.academy.atl_academy_individual_repo.entities;

public class Category {
    private String category;
    private String description;

    public Category(){

    }

    public Category(String category, String description){
        this.category = category;
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }
}
