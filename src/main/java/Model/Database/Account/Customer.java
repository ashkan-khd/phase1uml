package Model.Database.Account;

import Model.Database.Log.CustomerLog;

import java.util.ArrayList;

public class Customer extends Account {
    private ArrayList<CustomerLog> logs;

    public Customer(String username, String password) {
        super(username, password);
        this.type = "Customer";
    }

}
