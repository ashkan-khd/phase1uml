package View.Menu;

import java.util.ArrayList;

public class ProductsMenu extends MainMenu {
    public ProductsMenu(String name, Menu superMenu) {
        super(name, superMenu);
    }

    ArrayList<String> products;             //**
    ArrayList<String> searchedProducts;         //**
    String search;          //**
}
