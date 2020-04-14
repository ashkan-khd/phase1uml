package Model.Database.Account;

import Model.Database.Discount.Sale;
import Model.Database.Log.VendorLog;
import Model.Database.Repository.Product;

import java.util.ArrayList;

public class Vendor extends Account {
    private ArrayList<VendorLog> logs;
    private ArrayList<Sale> sales;

    public Vendor(String username, String password) {
        super(username, password);
        this.type = "Vendor";
        this.logs = new ArrayList<VendorLog>();
        this.sales = new ArrayList<Sale>();
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


}
