package Model.Database.Account;

import java.util.ArrayList;

public class AccountStore {
    private static AccountStore accStore = null;
    private ArrayList<Customer> allCustomers;
    private ArrayList<Vendor> allVendors;
    private ArrayList<Admin> allAdmins;
    private AccountStore()
    {
        this.allCustomers = new ArrayList<Customer>();
        this.allVendors = new ArrayList<Vendor>();
        this.allAdmins = new ArrayList<Admin>();
        //init files
    }

    public static AccountStore getInstance(){
        if(accStore == null)
            accStore = new AccountStore();
        return accStore;
    }

    private void getAllAccountsF() {}

    private void getAllAdminsF() {}

    private void getAllCustomersF() {}

    private void getAllVendorsF() {}

    public boolean isUsernameFree(String username) {return true;}

    public boolean isUsernameAndPasswordMatch(String username, String password) {return true;}

}
