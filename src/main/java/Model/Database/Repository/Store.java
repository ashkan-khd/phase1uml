package Model.Database.Repository;

import Model.Database.Account.Vendor;

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
        //arraylists and hashmaps
        //taking products from files
    }
    public static Store getInstance()
    {
        if(store == null)
            store = new Store();
        return store;
    }

    public void addProduct(String name, String company, Vendor vendor, String initPrice, boolean isCountable, int count) {}

    public void addProduct(String name, String company, Vendor vendor, String initPrice, boolean isCountable, double amount) {}

    private void addCountableProduct(Product product, int count) {}

    private void addUncountableProduct(Product product, double amount) {}

    public void getAllProductsF() {}


}
