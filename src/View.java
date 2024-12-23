import java.util.List;

public class View {
    public void displayTickets(List<Ticket> tickets){
        if (tickets.isEmpty()){
            System.out.println("No tickets ordered.");
        }else{
            System.out.println("Tickets ordered: ");
            for(int i =0; i < tickets.size(); i++) {
                Ticket ticket = tickets.get(i);
                System.out.print(i + ". " + ticket.getRoute().getDeparture() + " - " + ticket.getRoute().getDestination() +
                        " by passenger " + ticket.getPassenger().getName() + ". ");
                System.out.println("Transport class: " + ticket.getTransportClass());
            }
        }
    }

    public void displayMessage(String message){
        System.out.println(message);
    }
}
