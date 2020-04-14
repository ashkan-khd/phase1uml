package Controller.User;

import java.util.HashMap;

public class Manager extends User{

    public String[] manageUsers(){}

    public String[] viewUser(String username){}

    public boolean deleteUser(String username){}

    public String[] manageAllProducts(){}

    public boolean removeProduct(String productId){}

    public boolean createDiscountCode(String[] discountCodeProperties, String[] userNames){}

    public String[] viewDiscountCodes(){}

    public String[] viewADiscountCodeWithCode(String code){}

    public boolean editDiscountCode(String code){}

    public boolean removeDiscountCode(String code){}

    public String[] manageRequests(){}

    public String[] showRequestDetail(String requestId){}

    public boolean acceptARequest(String requestId){}

    public boolean declineARequest(String requestId){}

    public String[] manageCategories(){}

    public boolean editACategory(String categoryName, HashMap<String, String>){}

    public boolean addACategory(String[] categoryProperties){}

    public boolean removeACategory(String categoryName){}

    @Override
    public String viewPersonalInfo() {
        return super.viewPersonalInfo();
    }

    @Override
    public boolean editAProperty(String field) {
        return super.editAProperty(field);
    }
}
