package Model.Database.Repository;

import java.util.ArrayList;
import java.util.HashMap;

//singleTone
public class Store {
    private static Store store = null;
    private ArrayList<Product> allCountableProducts;
    private ArrayList<Product> allUncountableProducts;
    private HashMap<Product, Integer> productsCounts;
    private HashMap<Product, Double> productsAmount;
    private Store()
    {
        //new arraylists and hashmaps
    }
    public static Store getInstance()
    {
        if(store == null)
            store = new Store();
        return store;
    }

    public void addCountableProduct(Product product, int count) {}

    public void addUncountableProduct(Product product, double amount) {}

}
