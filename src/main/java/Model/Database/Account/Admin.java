package Model.Database.Account;

import Model.Database.Discount.OffCode;

import java.util.ArrayList;

public class Admin extends Account {
    private ArrayList<OffCode> allOffCodes;

    public Admin(String username, String password) {
        super(username, password);
        this.type = "Admin";
        this.allOffCodes = new ArrayList<OffCode>();
    }

    public ArrayList<OffCode> getAllOffCodes() {
        return allOffCodes;
    }

    public void addOffCodes(OffCode offCode)
    {

    }
}
