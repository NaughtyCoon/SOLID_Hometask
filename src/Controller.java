import java.util.Scanner;

public class Controller {
    private final Model model;
    private final View view;
    private final PassModel passModel;
    private final PassView passView;
    private final RoutesModel routesModel;
    private final RoutesView routesView;


    public Controller(Model model, View view, PassModel passModel, PassView passView, RoutesModel routesModel, RoutesView routesView) {
        this.model = model;
        this.view = view;
        this.passModel = passModel;
        this.passView = passView;
        this.routesModel = routesModel;
        this.routesView = routesView;
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println();
            System.out.println("Commands: ADD_PASSENGER(AP), LIST_PASSENGERS(LP), SEL_PASSENGER(SP), LIST_ROUTES(LR), SEL_ROUTE(SR)," +
                    " BOOK_TICKET(BT), REMOVE_TICKET(RT), LIST_TICKETS(LT), EXIT(EX)");
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            try {
                switch (command.toLowerCase()) {
                    case "add_passenger", "ap":
                        System.out.println("Enter passenger name: ");
                        String name = scanner.nextLine();
                        passModel.addPassenger(name);
                        passView.displayMessage("Passenger registered and selected.");
                        break;
                    case "list_passengers", "lp":
                        passView.displayPassengers(passModel.getPassengers(), PassModel.getPassIndex());
                        if (!passModel.getPassengers().isEmpty()) {
                            passView.displayMessage("Selected passenger: " + PassModel.getPassIndex());
                        }
                        break;
                    case "sel_passenger", "sp":
                        if (passModel.getPassengers().isEmpty()){
                            System.out.println("Register at least one passenger first.");
                        }else{
                            System.out.println("Enter an index to select a passenger: ");
                            PassModel.setPassIndex(Integer.parseInt(scanner.nextLine()));
                            passView.displayMessage(passModel.getPassengers().get(PassModel.getPassIndex()), PassModel.getPassIndex());
                            passView.displayMessage(" is selected");
                        }
                        break;
                    case "list_routes", "lr":
                        routesView.displayRoutes(routesModel.getRoutes(), RoutesModel.getRouteIndex());
                        break;
                    case "sel_route", "sr":
                        System.out.println("Enter route index.");
                        routesModel.setRouteIndex(Integer.parseInt(scanner.nextLine()));
                        routesView.displayMessage(routesModel.getRoutes().get(RoutesModel.getRouteIndex()), RoutesModel.getRouteIndex());
                        routesView.displayMessage(" is selected.");
                        break;
                    case "list_tickets", "lt":
                        view.displayTickets(model.getTickets());
                        break;
                    case "book_ticket", "bt":
                        if (passModel.getPassengers().isEmpty()){
                            System.out.println("Register at least one passenger first.");
                        }else{
                            Model.bookTicket(routesModel.getRoutes().get(RoutesModel.getRouteIndex()), passModel.getPassengers().get(PassModel.getPassIndex()));
                        }
                        break;
                    case "remove_ticket", "rt":
                        System.out.println("Enter an index of ticket to remove: ");
                        model.removeTicket(Integer.parseInt(scanner.nextLine()));
                        break;
                    case "exit", "ex":
                        view.displayMessage("Application exited.");
                        return;
                    default:
                        view.displayMessage("Unknown command!");
                }
            }
            catch (Exception e){
                view.displayMessage("Error: " + e.getMessage());
            }
        }
    }
}
