package Controller;

public class Buyer extends User {
    public String[] viewCart(){}

    public String[]  showProducts(){}

    public String[] viewSpecificProduct(String productId){}

    public boolean increaseNumberOfProduct(String productId){}

    public boolean decreaseNumberOfProduct(String productId){}

    public double showTotalPrice(){}

    public boolean purchase(){}

    public boolean receiveInformation(String[] information){}

    public boolean registerDiscountCode(String discountCode){}

    public boolean payment(){}

    public String[] viewOrders(){}

    public String[] showSpecificOrder(String orderId){}

    public boolean rate(String orderId, int rate){}

    public double viewBalance(){}

    public String[] viewDiscountCodes(){}
    @Override
    public String viewPersonalInfo() {
        return super.viewPersonalInfo();
    }

    @Override
    public boolean editAProperty(String field) {
        return super.editAProperty(field);
    }


}
