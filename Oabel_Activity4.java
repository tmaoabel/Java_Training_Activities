package ph.com.bpi.helloworld;
import java.util.Scanner;

public class Oabel_Activity4 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	

    System.out.print("Enter your age: ");
    int age = input.nextInt();

    
    if (age < 18) {
    	System.out.println("You're still a Minor.");
    } else if (age >= 18 && age <= 59) {
    	System.out.print("You're an Adult.");
    } else if (age > 18) {
    	System.out.print("You're already a Senior.");
    
    }
	input.close();
}
}