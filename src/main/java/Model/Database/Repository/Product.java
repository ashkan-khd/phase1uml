package Model.Database.Repository;

import Model.Database.Account.Vendor;

import java.util.ArrayList;

public class Product {
    enum ProductStat {
        GENERATING, EDITING, CONFIRMED;
    }
    private String Id;
    private ProductStat stat;
     //final category
    private int score;
    private int scoreCounter;
    private ArrayList<Comment> comments;
    private String name;
    private String company;
    private Vendor vendor;
    private String initPrice;
    private boolean isCountable;
    private Store store;
    private ArrayList<Category> mainCategories;

    public Product(String name, String company, Vendor vendor, String initPrice, boolean isCountable) {
        this.name = name;
        this.company = company;
        this.vendor = vendor;
        this.initPrice = initPrice;
        this.isCountable = isCountable;
        
        this.store = Store.getInstance();
        this.Id = generateNewId();
        this.score = 0;
        this.scoreCounter = 0;
        this.stat = ProductStat.GENERATING;
        this.comments = new ArrayList<Comment>();
        this.mainCategories = new ArrayList<Category>();
        this.addToStore();
        
    }

    private void addToStore() {
    }

    private String generateNewId() {
        return "new String";
    }

    public String getId() {
        return Id;
    }

    public int getScore() {
        return score;
    }

    public int getScoreCounter() {
        return scoreCounter;
    }

    public ArrayList<String> getComments() {
        return new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public String getInitPrice() {
        return initPrice;
    }

    public boolean isCountable() {
        return isCountable;
    }

    public void addCategory(Category category)
    {

    }

}
