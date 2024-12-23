import java.util.ArrayList;
import java.util.List;

public class RoutesModel {
    private static final List<Route> routes = new ArrayList<>();
    private static int routeIndex;

    public static int getRouteIndex() {
        return routeIndex;
    }

    public void setRouteIndex(int index) {
        if (index >= 0 && index<routes.size()){
            routeIndex = index;
        }else{
            throw new IllegalArgumentException("Wrong passenger index");
        }
    }

    public void addRoute(String departure, String destination){
        routes.add(new Route(departure, destination));
        routeIndex = routes.size() - 1;
    }

    public List<Route> getRoutes(){
        return routes;
    }

}
