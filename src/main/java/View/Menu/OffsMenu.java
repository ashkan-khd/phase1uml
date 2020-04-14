package View.Menu;

import java.util.ArrayList;

public class OffsMenu extends ProductsMenu {
    public OffsMenu(String name, Menu superMenu) {
        super(name, superMenu);
    }
    private ArrayList<String> offProducts;                  //**
    private ArrayList<String> searchedOffProducts;         //**
    private String search;                                  //**

    public ArrayList<String> getSaleProducts() {
        return offProducts;
    }


}
