package Model.Database.Log;

import java.util.Date;

public class CustomerLog extends Log {
    enum DeliveryStat {
        NOT_DELIVERED, DELIVERED;
    }
    private DeliveryStat deliveryStat;
    private Date deliveryDate;
    public CustomerLog(String name, Date date, String finalPrice) {
        super(name, date, finalPrice);
        deliveryStat = DeliveryStat.NOT_DELIVERED;
    }

    public void setDeliveryStat()
    {
        deliveryStat = DeliveryStat.DELIVERED;
        deliveryDate = new Date();
    }


}
