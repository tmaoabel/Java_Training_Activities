package OOP_Seatwork3;

public class Car {

    private String make;
    private String model;
    private int year;
    private String color;
    
    public Car () {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.color = "Unknown";
    }
    
    public Car(String make, String model, int year, String color) {
    	this.make = make;
    	this.model = model;
    	this.year = year;
    	this.color = color;
    }

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

    public void getCarDetails() {
    	System.out.println("Brand: " + make);
    	System.out.println("Model: " + model);
    	System.out.println("Year: " + year);
    	System.out.println("Color: " + color);
    	System.out.println(" ");
    }
    
    
}
