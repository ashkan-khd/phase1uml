package Model.Database.Discount;

import Model.Database.Account.Customer;
import Model.Database.Repository.Product;

import java.util.ArrayList;

public class OffCode {
    private String name;
    private String code;
    private ArrayList<Customer> involvedCustomers;

    public OffCode(String name, String code) {
        this.name = name;
        this.code = code;
        this.involvedCustomers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public ArrayList<Customer> getInvolvedCustomers() {
        return involvedCustomers;
    }

    public void setInvolvedCustomers(ArrayList<Customer> involvedCustomers) {
        this.involvedCustomers = involvedCustomers;
    }

    public void addInvolvedCustomer(Customer customer)
    {
        this.involvedCustomers.add(customer);
    }

}
