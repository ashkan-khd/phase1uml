package Model.Database.Account;

import java.io.CharArrayReader;
import java.util.ArrayList;

public abstract class Account {
    private static ArrayList<Customer> allCustomers;
    private static ArrayList<Vendor> allVendors;
    private static ArrayList<Admin> allAdmins;
    private String username;
    private String password;
    protected String type;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
        creatNewAccount(username, password);

    }

    //File
    public void initAllAcounts() {

    }

    //File
    private void creatNewAccount(String username, String password) { }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static boolean isUsernameFree(String username) {return true;}

    public static boolean isUsernameAndPasswordMatch(String username, String password) {return true;}


}
