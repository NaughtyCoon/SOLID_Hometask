public class Train implements Transport{
    @Override
    public void move(Route route) {
        System.out.println("Train goes from " + route.getDeparture() + "to " + route.getDestination());
    }
}
