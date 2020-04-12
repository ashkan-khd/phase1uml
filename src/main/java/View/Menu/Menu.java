package View.Menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public abstract class Menu {
    protected static Scanner scanner;
    protected String name;
    protected Menu superMenu;
    protected HashMap<Integer, Menu> subMenus;
    protected ArrayList<String> menuCommands;
    protected boolean hasLoggedIn;

    public Menu(String name, Menu superMenu) {
        this.name = name;
        this.superMenu = superMenu;
    }

    public String getName(){
        return this.name;
    }

    public Menu getSuperMenu(){
        return this.superMenu;
    }

    public HashMap getSubMenus(){
        return this.subMenus;
    }

    public void showMenuCommands(){}

    public void addSubMenu(Menu subMenu){

    }

    public void show(){}

    public void execute(){}

}
