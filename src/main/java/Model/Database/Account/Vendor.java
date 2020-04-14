package Model.Database.Account;

import Model.Database.Log.VendorLog;

public class Vendor extends Account {
    private VendorLog log;

    public Vendor(String username, String password) {
        super(username, password);
        this.type = "Vendor";
    }
}
