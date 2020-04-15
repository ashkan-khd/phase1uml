package Controller.User;

import Controller.Controller;
import Model.Database.Account.Account;
import Model.Database.Account.AccountStore;

public class User extends Controller{
    protected Account account;
    protected AccountStore accountStore;
    private boolean isClientLogin;

    public User() {
        this.accountStore = AccountStore.getInstance();
    }

    public boolean isClientLogin() {
        return isClientLogin;
    }

    public void setClientLogin(boolean clientLogin) {
        isClientLogin = clientLogin;
    }

    public boolean isThereUserWithThisName(String username){}

    public boolean isPasswordCorrect(String username, String password){}

    public User saveThisUserProperties(String[] splitInput, String rule){}

    public String viewPersonalInfo(){}

    public boolean editAProperty(String field){}
}
