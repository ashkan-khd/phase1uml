package Model.Database.Account;

import Model.Database.Log.CustomerLog;
import Model.Database.Repository.Product;

import java.util.ArrayList;

public class Customer extends Account {
    private ArrayList<CustomerLog> logs;
    private ArrayList<Product> cart;
    public Customer(String username, String password) {
        super(username, password);
        this.type = "Customer";
        this.logs = new ArrayList<CustomerLog>();
        this.cart = new ArrayList<Product>();
    }

    public ArrayList<CustomerLog> getLogs() {
        return logs;
    }

    public ArrayList<Product> getCart() {
        return cart;
    }

    public void setLogs(ArrayList<CustomerLog> logs) {
        this.logs = logs;
    }

    public void setCart(ArrayList<Product> cart) {
        this.cart = cart;
    }

    public void addLog(CustomerLog log)
    {

    }

    public void addCart(Product product)
    {

    }
}
