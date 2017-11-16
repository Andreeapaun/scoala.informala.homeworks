package PackageShipment;

/**
 * Created by Andreea.
 */
public class Trip extends Thread {
    public PackageTransport getTransport() {
        return transport;
    }

    private PackageTransport transport;
    private int pricePerKm = 0;

    public Trip(PackageTransport transport, int pricePerKm) {
        this.transport = transport;
        this.pricePerKm = pricePerKm;
    }

    public void run() {
        int km = this.transport.getDistance();
        try {
            for (int i = 0; i < km; i++) {
                sleep(1000);
                System.out.println("In localitatea " + transport.getLocation() + "s-au parcurs " + (i + 1) + " km din "
                        + transport.getDistance() + " ...");
            }
            this.transport.deliverComplete(this.pricePerKm);
            System.out.println("In localitatea " + transport.getLocation() + " a fost livrat " + this.transport.size() +
                    " si castigul este " + this.transport.getProfit() + " RON.");
        } catch (Exception a) {

        }
    }
}
