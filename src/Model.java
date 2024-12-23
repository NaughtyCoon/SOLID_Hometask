import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Model {
    private static final List<Ticket> tickets = new ArrayList<>();

    static Train train = new Train();
    static Plane plain = new Plane();
    // Add new transport here...

    public void removeTicket(int index){
        if (index >= 0 && index<tickets.size()){
            tickets.remove(index);
        }else{
            throw new IllegalArgumentException("Wrong ticket index");
        }
    }

    public List<Ticket> getTickets(){
        return tickets;
    }


    public static void bookTicket(Route route, Passenger passenger){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selected passenger: " + passenger.getName());
        System.out.println("Selected route: " + route.getDeparture() + " - " + route.getDestination());
        System.out.println("Select transport class: TRAIN(T), PLAIN(P), CANCEL(C)"); // Add a new command here in case you need to add a new transport class and...
        while (true){
            String command = scanner.nextLine();
            switch (command.toLowerCase()) {// ...add a new case block here to process that new transport class.
                case "train", "t":
                    tickets.add(new Ticket(route, passenger, "train"));
                    train.move(route);
                    return;
                case "plain", "p":
                    tickets.add(new Ticket(route, passenger, "plain"));
                    plain.move(route);
                    plain.instructions();
                    return;
                case "cancel", "c":
                    return;
                default:
                    System.out.println("Bad command! Please reenter a valid one.");
            }
        }
    }
}
