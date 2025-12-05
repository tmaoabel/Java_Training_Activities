package OOP_Seatwork3;

public class M2_Acitivity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();
		car1.setMake("Toyota");
		car1.setModel("Fortuner");
		car1.setYear(2025);
		car1.setColor("Pearl White");
		
		Car car2 = new Car("Ford","Territory",2024,"Ruby Red");
		
		System.out.println("==== Car 1 ====");
		car1.getCarDetails();
		
		System.out.println("==== Car 2 ====");
		car2.getCarDetails();
	}
}
