package Controller;

import Model.Database.Repository.Store;

public class Controller {
    protected Store store;

    public Controller() {
        this.store = Store.getInstance();
    }

}