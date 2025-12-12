package activitities;

interface BicycleParts {
    public int tyres = 2;
    public int maxSpeed = 15;
}

interface BicycleOperations {
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}

//Next create the base class Bicycle. It implements both interfaces BicycleParts, BicycleOperations. 
class Bicycle implements BicycleParts, BicycleOperations {
    public int gears;
    public int currentSpeed;

    //Initialize the values of gears and currentSpeed in a constructor.
    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }
    
    //applyBrake() reduces the currentSpeed by the number passed to the method.
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
        System.out.println("Current speed: " + currentSpeed);
    }

    //speedUp() increases the currentSpeed by the number passed to the method.
    public void speedUp(int increment) {
        currentSpeed += increment;
        System.out.println("Current speed: " + currentSpeed);
    }
    //Add another method to the base class - bicycleDesc().
    //Method to print info of Bicycle
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + maxSpeed);
    }
}


//Now create a derived class, MountainBike that extends Bicycle.
class MountainBike extends Bicycle {
    //This class adds another property: seatHeight.
    public int seatHeight;

    //In the constructor for MountainBike, use the super keyword to include gears and currentSpeed for this class. 
	//Also initialize seatHeight.
    public MountainBike(int gears, int currentSpeed, int startHeight) {
        //Invoking base-class(Bicycle) constructor
        super(gears, currentSpeed);
        seatHeight = startHeight;
    }

    // Add setHeight() method to the class to add a new value for the seatHeight variable.
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }  
}

//Driver class 
public class Activity7 {
    public static void main(String args[]) {
        MountainBike mb = new MountainBike(3, 0, 25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
    }
}