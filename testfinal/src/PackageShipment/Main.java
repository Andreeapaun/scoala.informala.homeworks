package PackageShipment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Andreea.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Start");

        PackageList packageList = new PackageList();

        packageList.add(new Package("Cluj", 30, 400, new Date(2017, 12, 12)));
        packageList.add(new Package("Cluj", 30, 200, new Date(2017, 11, 11)));
        packageList.add(new Package("Cluj", 30, 500, new Date(2017, 11, 11)));

        packageList.add(new Package("Suceava", 50, 100, new Date(2017, 12,12)));
        packageList.add(new Package("Suceava", 50, 600, new Date(2017, 11, 12)));
        packageList.add(new Package("Suceava", 50, 300, new Date(2017, 11, 12)));

        Date currentDate = new Date(2017, 11, 16);
        int profitPerKm = 1;

        // packages by location
        PackageList packagesToDeliver = new PackageList(packageList.getPackages(currentDate));
        packagesToDeliver.sortOnLocation();

        List<PackageTransport> transports = new ArrayList<PackageTransport>();
        PackageTransport transport = null;
        for (Package pack : packagesToDeliver.getPackages()) {
            if (transport != null && !transport.getLocation().equals(pack.getLocation())) {
                transports.add(transport);
                transport = new PackageTransport(pack.getDeliveryDate(), pack.getLocation(), pack.getDistance());
            }
            if (transport == null) {
                transport = new PackageTransport(pack.getDeliveryDate(), pack.getLocation(), pack.getDistance());
            }
            transport.add(pack);
        }
        if (transport != null) {
            transports.add(transport);
        }

        List<Trip> trips = new ArrayList<Trip>();
        for (PackageTransport t : transports) {
            Trip trip = new Trip(t, profitPerKm);
            trips.add(trip);
        }

        for (Trip trip : trips) {
            trip.start();
        }

        for (Trip trip : trips) {
            try {
                trip.join();
            } catch (Exception ex) {

            }
        }
        int totalProfit = 0;
        for (Trip trip : trips) {
            totalProfit += trip.getTransport().getProfit();
        }
        System.out.println("Castigul= " + totalProfit + " RON");
    }
}

