import java.util.ArrayList;
import java.util.List;

public class PassModel {
    private static final List<Passenger> passengers = new ArrayList<>();
    private static int passIndex;

    public static void setPassIndex(int index) {
        if (index >= 0 && index<passengers.size()){
            passIndex = index;
        }else{
            throw new IllegalArgumentException("Wrong passenger index");
        }
    }

    public static int getPassIndex() {
        return passIndex;
    }

    public void addPassenger(String name){
        passengers.add(new Passenger(name));
        passIndex = passengers.size()-1;
    }

    public void selectPassenger(int index){
        if (index >= 0 && index<passengers.size()){
            passIndex = index;
        }else{
            throw new IllegalArgumentException("Wrong passenger index");
        }
    }

    public List<Passenger> getPassengers(){
        return passengers;
    }

}
