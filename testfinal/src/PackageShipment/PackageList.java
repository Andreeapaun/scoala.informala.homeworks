package PackageShipment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by Andreea.
 */
public class PackageList {
    private ArrayList<Package> packages = new ArrayList<>();

    public PackageList() {

    }

    public PackageList(ArrayList<Package> packages) {
        this.packages = packages;
    }

    public void add(Package pck) {
        packages.add(pck);
    }

    public void sortOnDeliveryDate() {
        Collections.sort(this.packages, new Comparator<Package>() {
            @Override
            public int compare(Package a, Package b) {

                return a.getDeliveryDate().compareTo(b.getDeliveryDate());
            }
        });
    }

    public void sortOnLocation() {
        Collections.sort(this.packages, new Comparator<Package>() {
            @Override
            public int compare(Package a, Package b) {
                return a.getLocation().compareTo(b.getLocation());
            }
        });
    }

    public ArrayList<Package> getPackages(Date date) {
        ArrayList<Package> packagesForDate = new ArrayList<Package>();
        for (Package pack : packages) {
            if (pack.getDeliveryDate().equals(date)) {
                packagesForDate.add(pack);
            }
        }
        return packagesForDate;
    }

    public ArrayList<Package> getPackages() {
        return this.packages;
    }
}
