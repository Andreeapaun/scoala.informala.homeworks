package PackageShipment;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Andreea.
 */
public class PackageTransport {
    private ArrayList<Package> packages = new ArrayList<>();
    private Date deliveryDate;

    public int getProfit() {
        return profit;
    }

    private int profit = 0;

    public String getLocation() {
        return location;
    }

    private String location;

    public int getDistance() {
        return distance;
    }

    private int distance;

    public PackageTransport(Date deliveryDate, String location, int distance) {
        this.location = location;
        this.deliveryDate = deliveryDate;
        this.distance = distance;
    }

    public void add(Package pack) {
        if (pack.getLocation().equals(location) && pack.getDeliveryDate().equals(deliveryDate)) {
            packages.add(pack);
        }
    }

    public void deliverComplete(int pricePerKm) {
        this.profit = 0;
        for (Package p : packages) {
            p.deliverComplete(pricePerKm);
            this.profit += p.getProfit();
        }
    }

    public int size() {
        return this.packages.size();
    }

}
