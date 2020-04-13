package Controller.User;

import java.util.HashMap;

public class Seller extends User{
    @Override
    public String viewPersonalInfo() {
        return super.viewPersonalInfo();
    }

    @Override
    public boolean editAProperty(String field) {
        return super.editAProperty(field);
    }

    public String[] viewCompanyInformation(){}

    public String[] viewSalesHistory(){}

    public String[] viewProduct(String productName){}

    public String[] viewProductBuyers(String productId){}

    public boolean editAProduct(String productId, HashMap<String, String>){}

    public void addAProduct(String[] productProperties){}

    public boolean removeAProduct(String productId){}

    public String[] showCategories(){}

    public String[] viewAllOffProducts(){}

    public String[ ] viewASpecificOff(String offId){}

    public boolean editASpecificOff(String offId){}

    public void addAnOff(String[] offProperties)(){}

    public int viewBalance(){}
}
