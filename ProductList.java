package M3_Activity1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner gadget = new Scanner (System.in)) {
			List<String> products = new ArrayList<>();
			products.add("Laptop");
			products.add("Mouse");
			products.add("Keyboard");
			products.add("Monitor");
			products.add("Printer");
			
			System.out.println("=== PRODUCT LIST ===");
			for (String product : products ) {
				System.out.println(product);
			}
			
			products.add("Webcam");
			products.remove("Mouse");
			
			System.out.println("\n=== UPDATED PRODUCT LIST ===");
			for (String product : products ) {
				System.out.println(product);
			}
			
			System.out.print("\nEnter product you'd like to search: ");
			String productSearch = gadget.nextLine();
					
			System.out.println("\nSearching " + productSearch + "...");
			if (products.contains(productSearch)) {
				System.out.println(productSearch + " - found from the list");
			} else {
				System.out.println(productSearch + " - not found from the list");
			}
		}
		
	
		}

}
