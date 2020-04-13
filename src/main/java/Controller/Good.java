package Controller;

import Model.Database.Repository.Product;

public class Good extends Controller {
    private Product product;

    public Good(Product product) {
        this.product = product;
    }

    public String[] digest(){}

    public boolean addToCart(){}

    public boolean selectSeller(String sellerName){}

    public String[] showAttributes(){}

    public String[] compareToAnotherProducts(String  productId){}

    public boolean addComment(String[] comment){}
}
