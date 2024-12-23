public class Ticket {
    private Route route;
    private Passenger passenger;
    private String transportClass;

    public Ticket(Route route, Passenger passenger, String transportClass) {
        this.route = route;
        this.passenger = passenger;
        this.transportClass = transportClass;
    }

    public Route getRoute() {
        return route;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getTransportClass() {
        return transportClass;
    }

    public void setTransportClass(String transportClass) {
        this.transportClass = transportClass;
    }
}
