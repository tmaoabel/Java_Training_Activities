package ph.com.bpi.helloworld;

import java.util.Scanner;

public class Oabel_Activity2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        String ageString = input.nextLine(); 

        int ageInt = Integer.parseInt(ageString);
        double ageDouble = (double) ageInt;

        System.out.println("Your age as Int: " + ageInt);
        System.out.println("Your age as Double: " + ageDouble);

        input.close();
    }
}
	
