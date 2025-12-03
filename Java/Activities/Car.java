package activitities;
public class Car{
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	//constructor
	public Car() {
		tyres = 4;
		doors= 4;
	}
	
	public void displayCharacteristics() {
		System.out.println("Color: "+ color);
		System.out.println("Transmission type: "+ transmission);
		System.out.println("make: "+ make);
		System.out.println("number of tyres: "+ tyres);
		System.out.println("number of doors: "+ doors);
	}
	public void accelerate() {
		System.out.println("Car is moving forward.");
	}
	public void brake() {
		System.out.println("Car has stopped.");
	}
}