package M3_Activity3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Map;

public class M3_Activity3_ProductList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scanner = new Scanner (System.in); 
			
			HashMap<String,Integer> products = new HashMap<>();
			products.put("Laptop",60000);
			products.put("Mouse",1000);
			products.put("Keyboard",1500);
			products.put("Monitor",15000);
			products.put("Printer",10000);
			
			int option;
			
			do {
				System.out.println("\n=== PRODUCT MENU ===");
				System.out.println("1. Search a product");
				System.out.println("2. Add a product");
				System.out.println("3. Print all products");
				System.out.println("4. Find the cheapest product");
				System.out.println("5. Exit");
				System.out.print("Please select an option: ");
				option = scanner.nextInt();
				scanner.nextLine();
				
				switch (option) {
				//Option 1 - Search a product
				case 1:
					System.out.println("\nEnter the product you'd like to search: ");
					String productSearch = scanner.nextLine();
					System.out.println("\nSearching " + productSearch + "...");
					if (products.containsKey(productSearch)) {
						System.out.println(productSearch + " price: Php " + products.get(productSearch));
					} else {
						System.out.println(productSearch + " - not found from the list");
					}
					break;
					
				//Option 2 - Add a product
				case 2:
					System.out.println("\nEnter the product you'd like to add: ");
					String addProduct = scanner.nextLine();
					
					if (products.containsKey(addProduct)) {
						System.out.println("\nProduct " + addProduct + " already exists.");
					} else {
						System.out.println("\nEnter the product price: ");
						Integer addPrice = scanner.nextInt();

						products.put(addProduct, addPrice);
						System.out.println("\nAdding new product " + addProduct + "...");
						System.out.println("New product, " + addProduct + "(Php " + addPrice  + ")" + " is successfully added.");
					}
					break;
					
				//Option 3 - Print all products and count
				case 3:
					System.out.println("\n=== PRODUCT LIST ===");
					for (Map.Entry<String,Integer> entry : products.entrySet()) {
						System.out.println(entry.getKey() + " - Php " + entry.getValue());
					}
					System.out.println("Total number of products: " + products.size());
					break;

				//Option 4 - Exit		
				case 4:
					
					List<Map.Entry<String,Integer>> list = new ArrayList<>(products.entrySet());
					list.sort(Map.Entry.comparingByValue());
					
					Map.Entry<String,Integer> cheapest = list.get(0);
	
					System.out.println("\nHere's the cheapest product from the list: ");
					System.out.println(cheapest.getKey() + " - Php " + cheapest.getValue());
					break;
	
	
					
				//Option 5 - Exit		
				case 5:
					System.out.println("\nExiting...");
					break;
					
				default:
					System.out.println("\nInvalid option. Please choose another option.");
				}
								
			} while (option != 5);
			
			scanner.close();


		}
	
		}


