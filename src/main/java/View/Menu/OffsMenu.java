package View.Menu;

import java.util.ArrayList;

public class OffsMenu extends Menu {
    public OffsMenu(Menu superMenu) {
        super("salesMenu", superMenu);
    }
    private ArrayList<String> offProducts;                  //**
    private ArrayList<String> searchedOffProducts;         //**
    private String search;                                  //**

    public ArrayList<String> getSaleProducts() {
        return offProducts;
    }


}
