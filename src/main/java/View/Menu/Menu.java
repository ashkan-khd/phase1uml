package View.Menu;

import java.util.HashMap;
import java.util.Scanner;

public abstract class Menu {
    protected static Scanner scanner;
    protected String name;
    protected Menu superMenu;
    protected HashMap<Integer, Menu> subMenus;

    public Menu(String name, Menu superMenu) {
        this.name = name;
        this.superMenu = superMenu;
    }

    public void addSubMenu(Menu subMenu){

    }

    public void show(){}

    public void execute(){}

}
