import java.util.List;

public class TicketManager {
    void manage(List<Ticket> tickets){
        for (Ticket ticket: tickets){
            System.out.println(ticket);
        }
    }

    void manage(List<Ticket> tickets, String command){
        for (Ticket ticket: tickets){
            System.out.println(ticket);
        }
    }

}
