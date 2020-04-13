package Model.Database.Account;

public class Admin extends Account {

    public Admin(String username, String password) {
        super(username, password);
        this.type = "Admin";
    }
}
