package View.Menu.UserMenus;

import View.Menu.Menu;

public class UserMenu extends Menu {
    public UserMenu(Menu superMenu) {
        super("userMenu", superMenu);
    }
    private String user;            //**

    public String getUser() {
        return user;
    }


}
