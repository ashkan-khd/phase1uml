package View.Menu.UserMenus;

import View.Menu.MainMenu;
import View.Menu.Menu;

public class UserMenu extends MainMenu {

    public UserMenu(String name, Menu superMenu) {
        super(name, superMenu);
    }
    private String user;            //**

    public String getUser() {
        return user;
    }


}
