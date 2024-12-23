public class Plane implements Transport, AirborneSecurity{
    @Override
    public void move(Route route) {
        System.out.println("Plain flies from " + route.getDeparture() + "to " + route.getDestination());
    }

    @Override
    public void instructions() {
        System.out.println("Please don't forget to switch your mobile into flight mode.");
    }
}
