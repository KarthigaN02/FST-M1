package activitities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }


    /**********
	onboard(): add passengers to the array using the add() method
	takeOff(): returns the current date and time
	land(): sets the value of lastTimeLanded to the current date and time. Also clear() the array.
	getLastTimeLanded(): returns the value of lastTimeLanded.
	getPassesngers(): returns the array of passengers.
     ******/
	public void onboard(String passengerName) {
        if(passengers.size() <= maxPassengers) {
            this.passengers.add(passengerName);
        } else {
            System.out.println("Plane is full");
        }
    }

    public Date takeOff() {
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }

    public void land() {
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassengers() {
        return passengers;
    }
}

/*************
 * Create another class named Activity6. In this class we will have our main method.
First create an object of the Plane class named plane. Set the maxPassengers value to 10 by passing it to the constructor.
Add names to the passengers list using the onboard method.
Print the take-off time using the takeOff() method.
Print the list of passengers using the getPassengers() method.
Add a Thread.sleep() method to pause execution for 5 seconds. This is to emulate plane in flight.
Land() the plane and print the time of landing using getLastTimeLanded() method
 * 
 */
public class Activity6 {

    public static void main(String[] args) throws InterruptedException {
        //Create object with maxPassengers value to 10 
        Plane plane = new Plane(10);
        
        //Add names to the passengers list using the onboard method
        plane.onboard("Priya");
        plane.onboard("Ram");
        plane.onboard("Sita");
        
        //Print the take-off time using the takeOff() method
        System.out.println("Plane took off Time: " + plane.takeOff());
        
        //Print the list of passengers using the getPassengers() method
        System.out.println("List of passengers: " + plane.getPassengers());
        //Add a Thread.sleep() method to pause execution for 5 seconds. This is to emulate plane in flight.
        Thread.sleep(5000);
        //Land() the plane and print the time of landing using getLastTimeLanded() method
        plane.land();

        System.out.println("Plane time of landing " + plane.getLastTimeLanded());
    }
}