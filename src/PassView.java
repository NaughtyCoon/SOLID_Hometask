import java.util.List;

public class PassView {
    public void displayPassengers(List<Passenger> passengers, int selIndex){
        if (passengers.isEmpty()){
            System.out.println("No passengers registered.");
        }else{
            System.out.println("Passengers registered: ");
            for(int i =0; i < passengers.size(); i++) {
                Passenger passenger = passengers.get(i);
                displayMessage(passenger, i);
                System.out.println((i == selIndex)?" <Selected>":"");
            }
        }
    }

    public void displayMessage(String message){
        System.out.println(message);
    }

    public void displayMessage(Passenger passenger, int selIndex){
        System.out.print(selIndex + ". " + passenger.getName());
    }
}
