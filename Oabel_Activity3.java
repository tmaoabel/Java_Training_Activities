package ph.com.bpi.helloworld;

import java.util.Scanner;

public class Oabel_Activity3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter first integer: ");
        int num1 = input.nextInt(); 
        
        System.out.print("Please enter second integer: ");
        int num2 = input.nextInt(); 

        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);

    input.close();
    }
}
