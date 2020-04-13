package Model.Database.Account;

import Model.Database.Log.CustomerLog;

public class Customer extends Account {
    private CustomerLog log;

    public Customer(String username, String password) {
        super(username, password);
        this.type = "Customer";
    }


}
