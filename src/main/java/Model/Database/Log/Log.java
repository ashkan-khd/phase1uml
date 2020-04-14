package Model.Database.Log;

import java.util.Date;

public abstract class Log {
    private String Id;
    private String name;
    private Date date;
    private String finalPrice;
    //list of products


    public Log(String name, Date date, String finalPrice) {
        this.Id = generateNewId();
        this.name = name;
        this.date = date;
        this.finalPrice = finalPrice;
    }

    private String generateNewId() {
        return "new ID";
    }
}
