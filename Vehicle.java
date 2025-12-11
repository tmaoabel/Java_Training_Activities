package M2_Activity6;

public abstract class Vehicle {
	int numberOfWheels;
	String brand;
	
	public Vehicle(int numberOfWheels, String brand) {
        this.numberOfWheels = numberOfWheels;
        this.brand = brand;
    }
	
	abstract void startEngine();
	abstract void refuel();
	
	public void destroy() {
        System.out.println(brand + " is being destroyed...");
    }
	
	public void showInfo() {
        System.out.println("Brand: " + brand );
        System.out.println("No. Of Wheels: " + numberOfWheels);
        //System.out.println();
    }

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
