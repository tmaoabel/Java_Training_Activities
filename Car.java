package M2_Activity6;

public class Car extends Vehicle implements Refuelable {
/*	public Car(String brand) {
		super(numberOfWheels,brand);
	}*/
	
	public Car(int numberOfWheels, String brand) {
		super(numberOfWheels, brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void startEngine() {
		System.out.println(brand + " is starting its engine... ");
	}
	
	@Override
	public void refuel() {
		System.out.println(brand + " is being refuelled...");
	}
}
