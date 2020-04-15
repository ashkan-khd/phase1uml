package Model.Database.Account;

import Model.Database.Discount.Sale;
import Model.Database.Log.VendorLog;
import Model.Database.Repository.Product;

import java.util.ArrayList;
import java.util.HashMap;

public class Vendor extends Account {
    private ArrayList<VendorLog> logs;
    private ArrayList<Sale> sales;
    private HashMap<Product, Double> unacceptedProducts;
    private HashMap<Product, Double> acceptedProducts;

    public Vendor(String username, String password) {
        super(username, password);
        this.type = "Vendor";
        this.logs = new ArrayList<VendorLog>();
        this.sales = new ArrayList<Sale>();
        this.unacceptedProducts = new HashMap<Product, Double>();
        this.acceptedProducts = new HashMap<Product, Double>();
    }

    public ArrayList<VendorLog> getLogs() {
        return logs;
    }

    public ArrayList<Sale> getSales() {
        return sales;
    }

    public void addLog(VendorLog log)
    {

    }

    public void addSale(Sale sale)
    {

    }

    private void addProduct(Product product, int count)
    {

    }

    private void addProduct(Product product, double amount)
    {

    }

}
