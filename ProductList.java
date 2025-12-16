package M3_Activity2;
import java.util.HashSet;
import java.util.Scanner;

public class ProductList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner scanner = new Scanner (System.in)) {
			HashSet<String> products = new HashSet<>();
			products.add("Laptop");
			products.add("Mouse");
			products.add("Keyboard");
			products.add("Monitor");
			products.add("Printer");
			
			int option;
			
			do {
				System.out.println("\n=== PRODUCT MENU ===");
				System.out.println("1. Search a product");
				System.out.println("2. Add a product");
				System.out.println("3. Print all products");
				System.out.println("4. Exit");
				System.out.print("Please select an option: ");
				option = scanner.nextInt();
				scanner.nextLine();
				
				switch (option) {
				//Option 1 - Search a product
				case 1:
					System.out.println("\nEnter the product you'd like to search: ");
					String productSearch = scanner.nextLine();
					System.out.println("\nSearching " + productSearch + "...");
					if (products.contains(productSearch)) {
						System.out.println(productSearch + " - found from the list");
					} else {
						System.out.println(productSearch + " - not found from the list");
					}
					break;
					
				//Option 2 - Add a product
				case 2:
					System.out.println("\nEnter the product you'd like to add: ");
					String addProduct = scanner.nextLine();
					System.out.println("\nAdding new product " + addProduct + "...");
					if (products.add(addProduct)) {
						System.out.println("\nNew product, " + addProduct + " is successfully added.");
					} else {
						System.out.println("\nProduct " + addProduct + " already exists.");
					}
					break;
					
				//Option 3 - Print all products and count
				case 3:
					System.out.println("\n=== PRODUCT LIST ===");
					for (String product : products ) {
						System.out.println(product);
					}
					System.out.println("Total number of products: " + products.size());
					break;

				//Option 4 - Exit		
				case 4:
					System.out.println("\nExiting...");
					break;
					
				default:
					System.out.println("\nInvalid option. Please choose another option.");
				}
								
			} while (option != 4);
			
			scanner.close();


		}
	
		}

}
