package outdoorStore;

import java.util.Scanner;

public class Main {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Products products = new Products();
		System.out.println("Welcome to the Outdoor Store shopping system!\n");
		products.myMenu();
		if (products.getTotal() == 0.00) {
			System.exit(0);
		} else {
			products.itemReceipt();
		}
	}
}
