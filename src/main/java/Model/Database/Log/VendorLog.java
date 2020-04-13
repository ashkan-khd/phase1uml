package Model.Database.Log;

import java.util.Date;

public class VendorLog extends Log {
    enum ShippingStat {

    }
    private ShippingStat shippingStat;
    private Date shippingDate;
    public VendorLog(String name, Date date, String finalPrice) {
        super(name, date, finalPrice);
    }

    public void setShippingStat() {

    }

}
