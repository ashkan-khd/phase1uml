package Model.Database.Account;

import Model.Database.Log.VendorLog;

import java.util.ArrayList;

public class Vendor extends Account {
    private ArrayList<VendorLog> logs;

    public Vendor(String username, String password) {
        super(username, password);
        this.type = "Vendor";
        this.logs = new ArrayList<VendorLog>();
    }


}
