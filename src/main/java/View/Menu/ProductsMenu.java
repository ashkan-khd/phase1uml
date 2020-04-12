package View.Menu;

import java.util.ArrayList;

public class ProductsMenu extends Menu {
    public ProductsMenu(Menu superMenu) {
        super("productMenu", superMenu);
    }
    ArrayList<String> products;             //**
    ArrayList<String> searchedProducts;         //**
    String search;          //**
}
