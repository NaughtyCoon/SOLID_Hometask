import java.util.List;


public class Main {

    public static void main(String[] args) {

        Model model = new Model();
        View view = new View();
        PassModel passModel = new PassModel();
        PassView passView = new PassView();
        RoutesModel routesModel = new RoutesModel();
        RoutesView routesView = new RoutesView();

        routesModel.addRoute("London", "Liverpool");
        routesModel.addRoute("London", "Manchester");
        routesModel.addRoute("London", "Glasgow");
        routesModel.addRoute("London", "Cardiff");
        routesModel.addRoute("London", "York");
        routesModel.setRouteIndex(0);

        Controller controller = new Controller(model, view, passModel, passView, routesModel, routesView);

        controller.start();
    }
}