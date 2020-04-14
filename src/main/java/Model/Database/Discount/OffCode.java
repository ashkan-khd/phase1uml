package Model.Database.Discount;

import Model.Database.Account.Customer;

import java.util.ArrayList;
import java.util.Date;

public class OffCode {
    private String name;
    private String code;
    private Date startDate;
    private Date endDate;
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

    public void setStartDate() {}

    public void setEndDate(Date date) {}

}
