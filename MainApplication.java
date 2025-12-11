package M2_Activity6;

public class MainApplication {
	public static void main(String[] args) {
		
	Car car = new Car(4,"Toyota");
	Truck truck = new Truck(6,"Mitsubishi");
	
	System.out.println("=== CAR DETAILS ===");
	car.showInfo();
	car.refuel();
	car.startEngine();
	System.out.println();
	
	System.out.println("=== TRUCK DETAILS ===");
	truck.showInfo();
	truck.refuel();
	truck.startEngine();
	
	System.out.println();
	destroyVehicle(car);
	destroyVehicle(truck);
	
}

public static void destroyVehicle(Vehicle vehicle) {
    vehicle.destroy();
}

}

