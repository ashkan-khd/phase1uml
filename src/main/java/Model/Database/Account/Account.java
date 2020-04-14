package Model.Database.Account;

import java.io.CharArrayReader;
import java.util.ArrayList;

public abstract class Account {
    private AccountStore accstore;
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
        this.accstore = AccountStore.getInstance();
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


}
