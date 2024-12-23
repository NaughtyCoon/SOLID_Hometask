import java.util.List;

public class RoutesView {
    public void displayRoutes(List<Route> routes, int selIndex){
        System.out.println("Routes available: ");
        for(int i =0; i < routes.size(); i++){
            Route route = routes.get(i);
            displayMessage(route, i);
            System.out.println((i == selIndex)?" <Selected>":"");
        }
    }

    public void displayMessage(String message){
        System.out.println(message);
    }

    public void displayMessage(Route route, int selIndex){
        System.out.print(selIndex + ". " + route.getDeparture() + " - " + route.getDestination());
    }
}
