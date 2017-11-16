package PackageShipment;

import java.util.Date;

/**
 * Created by Andreea.
 */
public class Package {
    private String location;
    private int distance;
    private int value;
    private Date deliveryDate;
    private int profit;

    public String getLocation() {
        return location;
    }

    public int getDistance() {
        return distance;
    }

    public int getValue() {
        return value;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public int getProfit() {
        return profit;
    }

    public Package(String location, int distance, int value, Date deliveryDate) {
        this.location = location;
        this.distance = distance;
        this.value = value;
        this.deliveryDate = deliveryDate;
    }

    public void deliverComplete(int pricePerKm) {
        this.profit = pricePerKm * distance;
    }
}

