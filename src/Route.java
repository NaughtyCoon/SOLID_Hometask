public class Route {
    private final String departure;
    private final String destination;

    public Route(String departure, String destination) {
        this.departure = departure;
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }
}
