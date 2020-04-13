package Controller;

public class User extends Controller{
    // add an account from model
    protected String username;
    private boolean isClientLogin;

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
