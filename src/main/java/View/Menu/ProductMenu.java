package View.Menu;

import java.util.ArrayList;

public class ProductMenu extends Menu {
    public ProductMenu(Menu superMenu) {
        super("productMenu", superMenu);
    }
    ArrayList<String> products;             //**
    ArrayList<String> searchedProducts;         //**
    String search;          //**
}
