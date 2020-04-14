package Model.Database.Discount;

import Model.Database.Account.Vendor;
import Model.Database.Repository.Product;

import java.util.ArrayList;
import java.util.Date;

public class Sale {
    enum SaleStat {
        GENERATING, EDITTING, CONFIRMED
    }
    private Vendor vendor;
    private String name;
    private Date startDate;
    private Date endDate;
    private SaleStat saleStat;
    private ArrayList<Product> involedProduts;

    public Sale(Vendor vendor, String name) {
        this.vendor = vendor;
        this.name = name;
        this.saleStat = SaleStat.GENERATING;
    }

    public void setInvoledProduts(ArrayList<Product> involedProduts) {
        this.involedProduts = involedProduts;
    }

    public void addInvolvedProduct(Product product) {
    }

    public void setStartDate() {}

    public void setEndDate(Date date) {}

    public void setStat(String statstr) {}

    public String getStat(){return saleStat.toString();}


}
