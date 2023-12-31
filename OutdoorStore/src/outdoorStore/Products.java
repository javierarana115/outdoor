package outdoorStore;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Products extends MainUtil {
	double total = 0;
	String decision;

	public static Scanner input = new Scanner(System.in);
	ArrayList<String> itemsList = new ArrayList<String>();
	ArrayList<String> priceList = new ArrayList<String>();

	public void myMenu() {

		boolean loop = true;

		System.out.println("What department would you like to look at?");
		System.out.println("1. Camping\n2. Hiking\n3. Action Sports\n4. Close Program");

		do {
			int choice = 0;
			choice = validateInputmyMenu(choice);
			switch (choice) {
			case 1:
				menuPrompt("Camping");
				Camping();
				loop = false;
				break;
			case 2:
				menuPrompt("Hiking");
				Hiking();
				loop = false;
				break;
			case 3:
				menuPrompt("Action Sports");
				ActionSports();
				loop = false;
				break;
			case 4:
				loop = false;
				break;
			default:
				System.out.println("Please enter the appropriate input");
				break;
			}

		} while (loop);

	}

	public void Camping() {

		boolean loop = true;
		System.out.println("What would you like to look at?");
		System.out.println(
				"1. Tents\n2. Sleeping bags\n3. Camp Kitchen\n4. Emergency & Survival\n5. Go Back\n6. Close Program");

		do {
			int choice = 0;

			choice = validateInputCHA(choice);
			switch (choice) {
			case 1:
				System.out.println("Tent Options:\n");
				campTents();
				loop = false;
				break;
			case 2:
				System.out.println("Sleeping Bag Options:\n");
				campSleepBags();
				loop = false;
				break;
			case 3:
				System.out.println("Camp Kitchen Options:\n");
				campKitchen();
				loop = false;
				break;
			case 4:
				System.out.println("Emergency & Survival Options:\n");
				campES();
				loop = false;
				break;
			case 5:
				myMenu();
				loop = false;
				break;
			case 6:
				loop = false;
				break;
			default:
				System.out.println("Please enter the appropriate input");
				input.next();
				break;
			}

		} while (loop);

	}

	public void Hiking() {

		boolean loop = true;

		System.out.println("What would you like to look at?");
		System.out.println("1. Backpacks\n2. Hiking poles\n3. Water Bottles\n4. Snacks\n5. Go Back\n6. Close Program");

		do {
			int choice = 0;

			choice = validateInputCHA(choice);
			switch (choice) {
			case 1:
				System.out.println("Backpack Options:\n");
				hikeBackPacks();
				loop = false;
				break;
			case 2:
				System.out.println("Hiking pole Options:\n");
				hikePoles();
				loop = false;
				break;
			case 3:
				System.out.println("Water Bottle Options:\n");
				hikeWaterBottles();
				loop = false;
				break;
			case 4:
				System.out.println("Snack Options:\n");
				hikeSnacks();

				loop = false;
				break;
			case 5:
				myMenu();
				loop = false;
				break;
			case 6:
				loop = false;
				break;
			default:
				System.out.println("Please enter the appropriate input");
				input.next();
				break;
			}

		} while (loop);

	}

	public void ActionSports() {

		boolean loop = true;

		System.out.println("What would you like to look at?");
		System.out.println(
				"1. Bikes\n2. Helmets\n3. Skis and Snowboards\n4. Climbing Gear\n5. Go Back\n6. Close Program");

		do {
			int choice = 0;

			choice = validateInputCHA(choice);
			switch (choice) {
			case 1:
				System.out.println("Bikes");
				asBikes();
				loop = false;
				break;
			case 2:
				System.out.println("Helmets");
				asHelmets();
				loop = false;
				break;
			case 3:
				System.out.println("Skis and Snowboards");
				snowSports();
				loop = false;
				break;
			case 4:
				System.out.println("Climbing Gear");
				climbGear();
				loop = false;
				break;
			case 5:
				myMenu();
				loop = false;
				break;
			case 6:
				loop = false;
				break;
			default:
				System.out.println("Please enter the appropriate input");
				input.next();
				break;
			}

		} while (loop);

	}

	// Camping Options
	public void campTents() {

		String[] campTents = new String[3];
		double[] priceTents = new double[3];

		int itemSKU = 1401;
		campTents[0] = "Small Tent";
		campTents[1] = "Medium Tent";
		campTents[2] = "Large Tent";

		priceTents[0] = 89.99;
		priceTents[1] = 250.50;
		priceTents[2] = 899.00;

		for (int i = 0; i < campTents.length; i++) {
			System.out.println("|-------------------------------------------------------------------------------|");
			System.out.printf("| Item SKU: %d |\t\t%-11s\t\t|\t$%7.2f\t|\n", itemSKU, campTents[i], priceTents[i]);
			itemSKU++;
		}

		System.out.println("|-------------------------------------------------------------------------------|");
		System.out.println("\n");
		System.out.println("Enter Item SKU to add to Cart\n5. Go back\n6. Close Program");
		boolean loop = false;

		do {
			int choice = 0;

			choice = validateInputTents(choice);
			switch (choice) {
			case 1401:
				System.out.println("Item has been added to your cart");
				addTotal(89.99);
				itemsList.add("\nSmall Tent");
				priceList.add("89.99");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					campTents();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 1402:
				System.out.println("Item has been added to your cart");
				addTotal(250.50);
				itemsList.add("\nMedium Tent");
				priceList.add("250.50");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					campTents();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 1403:
				System.out.println("Item has been added to your cart");
				addTotal(899.00);
				itemsList.add("\nLarge Tent");
				priceList.add("899.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					campTents();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 5:
				Camping();
				break;
			case 6:
				break;
			default:
				System.out.println("Please enter the appropriate input");
				input.next();
				break;
			}

		} while (loop);

	}

	public void campSleepBags() {
		String[] campSleepBag = new String[3];
		double[] priceSleepBag = new double[3];

		int itemSKU = 5211;
		campSleepBag[0] = "Standard Sleeping Bag";
		campSleepBag[1] = "Cozy Sleeping Bag";
		campSleepBag[2] = "Down Feather Sleeping Bag";

		priceSleepBag[0] = 64.99;
		priceSleepBag[1] = 150.00;
		priceSleepBag[2] = 300.00;

		for (int i = 0; i < campSleepBag.length; i++) {
			System.out.println(
					"|-----------------------------------------------------------------------------------------------|");
			System.out.printf("| Item SKU: %d |\t\t%-25s\t\t|\t$%7.2f\t|\n", itemSKU, campSleepBag[i],
					priceSleepBag[i]);
			itemSKU++;
		}
		System.out.println(
				"|-----------------------------------------------------------------------------------------------|");
		System.out.println("\n");
		System.out.println("Enter Item SKU to add to Cart\n5. Go back\n6. Close Program");
		boolean loop = false;

		do {
			int choice = 0;

			choice = validateInputSleepBags(choice);
			switch (choice) {
			case 5211:
				System.out.println("Item has been added to your cart");
				addTotal(64.99);
				itemsList.add("\nStandard Sleeping Bag");
				priceList.add("64.99");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					campSleepBags();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 5212:
				System.out.println("Item has been added to your cart");
				addTotal(150.00);
				itemsList.add("\nCozy Sleeping Bag");
				priceList.add("150.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					campSleepBags();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 5213:
				System.out.println("Item has been added to your cart");
				addTotal(300.00);
				itemsList.add("\nDown Feather Sleeping Bag");
				priceList.add("300.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					campSleepBags();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 5:
				Camping();
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("Please enter the appropriate input");
				input.next();
				break;
			}

		} while (loop);

	}

	public void campKitchen() {
		String[] campPlate = new String[2];
		double[] pricePlate = new double[2];

		String[] campThermos = new String[2];
		double[] priceThermos = new double[2];

		String[] campCutlery = new String[1];
		double[] priceCutlery = new double[1];

		int itemSKU1 = 1555;
		int itemSKU2 = 3512;
		int itemSKU3 = 4504;

		// Plates
		campPlate[0] = "Small Plate";
		campPlate[1] = "Large Plate";

		pricePlate[0] = 15.00;
		pricePlate[1] = 20.00;

		// Thermos
		campThermos[0] = "50oz Thermos";
		campThermos[1] = "75oz Thermos";

		priceThermos[0] = 45.00;
		priceThermos[1] = 65.00;

		// Cutlery
		campCutlery[0] = "Camp Cutlery Set";

		priceCutlery[0] = 35.00;

		System.out.println("|---------------------------------------------------------------------------------------|");

		for (int i = 0; i < campPlate.length; i++) {
			System.out.printf("| Item SKU: %d |\t\t%-16s\t\t|\t$%7.2f\t|\n", itemSKU1, campPlate[i], pricePlate[i]);
			itemSKU1++;
			System.out.println(
					"|---------------------------------------------------------------------------------------|");

		}

		for (int i = 0; i < campThermos.length; i++) {
			System.out.printf("| Item SKU: %d |\t\t%-16s\t\t|\t$%7.2f\t|\n", itemSKU2, campThermos[i], priceThermos[i]);
			itemSKU2++;
			System.out.println(
					"|---------------------------------------------------------------------------------------|");

		}
		for (int i = 0; i < campCutlery.length; i++) {
			System.out.printf("| Item SKU: %d |\t\t%-16s\t\t|\t$%7.2f\t|\n", itemSKU3, campCutlery[i], priceCutlery[i]);
			itemSKU3++;
		}
		System.out.println("|---------------------------------------------------------------------------------------|");
		System.out.println("\n");
		System.out.println("Enter Item SKU to add to Cart\n5. Go back\n6. Close Program");
		boolean loop = false;

		do {
			int choice = 0;

			choice = validateInputCampKitchen(choice);
			switch (choice) {
			case 1555:
				System.out.println("Item has been added to your cart");
				addTotal(15.00);
				itemsList.add("\nSmall Plate");
				priceList.add("15.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					campKitchen();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 1556:
				System.out.println("Item has been added to your cart");
				addTotal(20.00);
				itemsList.add("\nLarge Plate");
				priceList.add("20.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					campKitchen();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 3512:
				System.out.println("Item has been added to your cart");
				addTotal(45.00);
				itemsList.add("50oz Thermos");
				priceList.add("45.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					campKitchen();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 3513:
				System.out.println("Item has been added to your cart");
				addTotal(65.00);
				itemsList.add("70oz Thermos");
				priceList.add("65.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					campKitchen();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 4504:
				System.out.println("Item has been added to your cart");
				addTotal(35.00);
				itemsList.add("Camp Cutlery Set");
				priceList.add("35.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					campKitchen();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 5:
				Camping();
				break;
			case 6:
				break;
			default:
				System.out.println("Please enter the appropriate input");
				input.next();
				break;
			}

		} while (loop);

	}

	public void campES() {
		String[] campFirstAid = new String[1];
		double[] priceFirstAid = new double[1];

		String[] campBearMace = new String[1];
		double[] priceBearMace = new double[1];

		int itemSKU1 = 7002;
		int itemSKU2 = 5550;
		campFirstAid[0] = "First Aid Kit";
		priceFirstAid[0] = 25.00;

		campBearMace[0] = "Bear Mace";
		priceBearMace[0] = 45.00;

		for (int i = 0; i < campFirstAid.length; i++) {
			System.out.println("|-------------------------------------------------------------------------------|");
			System.out.printf("| Item SKU: %d |\t\t%-13s\t\t|\t$%7.2f\t|\n", itemSKU1, campFirstAid[i],
					priceFirstAid[i]);
			itemSKU1++;
		}
		for (int i = 0; i < campBearMace.length; i++) {
			System.out.println("|-------------------------------------------------------------------------------|");
			System.out.printf("| Item SKU: %d |\t\t%-13s\t\t|\t$%7.2f\t|\n", itemSKU2, campBearMace[i],
					priceBearMace[i]);
			itemSKU2++;
		}
		System.out.println("|-------------------------------------------------------------------------------|");
		System.out.println("\n");
		System.out.println("Enter Item SKU to add to Cart\n5. Go back\n6. Close Program");
		boolean loop = false;

		do {
			int choice = 0;

			choice = validateInputES(choice);
			switch (choice) {
			case 7002:
				System.out.println("Item has been added to your cart");
				addTotal(25.00);
				itemsList.add("First Aid Kit");
				priceList.add("25.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					campES();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 5550:
				System.out.println("Item has been added to your cart");
				addTotal(45.00);
				itemsList.add("Bear Mace");
				priceList.add("45.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					campES();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 5:
				Camping();
				break;
			case 6:
				break;
			default:
				System.out.println("Please enter the appropriate input");
				input.next();
				break;
			}

		} while (loop);

	}

	// Hiking Options
	public void hikeBackPacks() {
		String[] hikeBackpacks = new String[3];
		double[] priceBackpacks = new double[3];

		int itemSKU = 9800;

		hikeBackpacks[0] = "Hiking Backpack";
		hikeBackpacks[1] = "Lightweight Backpack";
		hikeBackpacks[2] = "Travel Backpack";

		priceBackpacks[0] = 65.00;
		priceBackpacks[1] = 80.00;
		priceBackpacks[2] = 75.00;

		for (int i = 0; i < hikeBackpacks.length; i++) {
			System.out.println(
					"|---------------------------------------------------------------------------------------|");
			System.out.printf("| Item SKU: %d |\t\t%-20s\t\t|\t$%7.2f\t|\n", itemSKU, hikeBackpacks[i],
					priceBackpacks[i]);
			itemSKU++;
		}
		System.out.println("|---------------------------------------------------------------------------------------|");
		System.out.println("\n");
		System.out.println("Enter Item SKU to add to Cart\n5. Go back\n6. Close Program");
		boolean loop = false;

		do {
			int choice = 0;

			choice = validateInputHikeBackpacks(choice);
			switch (choice) {
			case 9800:
				System.out.println("Item has been added to your cart");
				addTotal(65.00);
				itemsList.add("Hiking Backpack");
				priceList.add("65.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					hikeBackPacks();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 9801:
				System.out.println("Item has been added to your cart");
				addTotal(80.00);
				itemsList.add("Lightweight Backpack");
				priceList.add("80.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					hikeBackPacks();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 9802:
				System.out.println("Item has been added to your cart");
				addTotal(75.00);
				itemsList.add("Travel Backpack");
				priceList.add("75.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					hikeBackPacks();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 5:
				Hiking();
				break;
			case 6:
				break;
			default:
				System.out.println("Please enter the appropriate input");
				input.next();
				break;
			}

		} while (loop);
	}

	public void hikePoles() {

		String[] hikePoles = new String[3];
		double[] pricePoles = new double[3];

		int itemSKU = 2100;
		hikePoles[0] = "Standard Hiking Pole";
		hikePoles[1] = "Premium Hiking Pole";
		hikePoles[2] = "Ultra light Hiking Pole";

		pricePoles[0] = 95.00;
		pricePoles[1] = 120.95;
		pricePoles[2] = 220.00;

		for (int i = 0; i < hikePoles.length; i++) {
			System.out.println(
					"|---------------------------------------------------------------------------------------|");
			System.out.printf("| Item SKU: %d |\t\t%-23s\t\t|\t$%7.2f\t|\n", itemSKU, hikePoles[i], pricePoles[i]);
			itemSKU++;
		}
		System.out.println("|---------------------------------------------------------------------------------------|");
		System.out.println("\n");
		System.out.println("Enter Item SKU to add to Cart\n5. Go back\n6. Close Program");
		boolean loop = false;

		do {
			int choice = 0;

			choice = validateInputHikePoles(choice);
			switch (choice) {
			case 2100:
				System.out.println("Item has been added to your cart");
				addTotal(95.00);
				itemsList.add("Standard Hiking Pole");
				priceList.add("95.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					hikePoles();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 2101:
				System.out.println("Item has been added to your cart");
				addTotal(120.95);
				itemsList.add("Premium Hiking Pole");
				priceList.add("120.95");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					hikePoles();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 2102:
				System.out.println("Item has been added to your cart");
				addTotal(220.00);
				itemsList.add("Ultra light Hiking Pole");
				priceList.add("220.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					hikePoles();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 5:
				Hiking();
				break;
			case 6:
				break;
			default:
				System.out.println("Please enter the appropriate input");
				input.next();
				break;
			}

		} while (loop);

	}

	public void hikeWaterBottles() {
		String[] hikeBottle = new String[2];
		double[] priceHikeBottle = new double[2];

		int itemSKU = 105;
		hikeBottle[0] = "20oz Water Bottle";
		hikeBottle[1] = "45oz Water Bottle";

		priceHikeBottle[0] = 17.00;
		priceHikeBottle[1] = 28.00;

		for (int i = 0; i < hikeBottle.length; i++) {
			System.out.println(
					"|---------------------------------------------------------------------------------------|");
			System.out.printf("| Item SKU: %d |\t\t%-17s\t\t|\t$%7.2f\t|\n", itemSKU, hikeBottle[i],
					priceHikeBottle[i]);
			itemSKU++;
		}
		System.out.println("|---------------------------------------------------------------------------------------|");
		System.out.println("\n");
		System.out.println("Enter Item SKU to add to Cart\n5. Go back\n6. Close Program");
		boolean loop = false;

		do {
			int choice = 0;

			choice = validateInputHikeBottles(choice);
			switch (choice) {
			case 105:
				System.out.println("Item has been added to your cart");
				addTotal(17.00);
				itemsList.add("20oz Water Bottle");
				priceList.add("17.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					hikeWaterBottles();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 106:
				System.out.println("Item has been added to your cart");
				addTotal(28.00);
				itemsList.add("45oz Water Bottle");
				priceList.add("28.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					hikeWaterBottles();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 5:
				Hiking();
				break;
			case 6:
				break;
			default:
				System.out.println("Please enter the appropriate input");
				input.next();
				break;
			}

		} while (loop);
	}

	public void hikeSnacks() {
		String[] hikeSnacks = new String[3];
		double[] priceSnacks = new double[3];

		int itemSKU = 3519;
		hikeSnacks[0] = "Granola Bar";
		hikeSnacks[1] = "Dried Mango";
		hikeSnacks[2] = "Protein Cookie";

		priceSnacks[0] = 3.50;
		priceSnacks[1] = 7.00;
		priceSnacks[2] = 8.50;

		for (int i = 0; i < hikeSnacks.length; i++) {
			System.out.println("|-------------------------------------------------------------------------------|");
			System.out.printf("| Item SKU: %d |\t\t%-14s\t\t|\t$%7.2f\t|\n", itemSKU, hikeSnacks[i], priceSnacks[i]);
			itemSKU++;
		}
		System.out.println("|-------------------------------------------------------------------------------|");
		System.out.println("\n");
		System.out.println("Enter Item SKU to add to Cart\n5. Go back\n6. Close Program");
		boolean loop = false;

		do {
			int choice = 0;

			choice = validateInputHikeSnacks(choice);
			switch (choice) {
			case 3519:
				System.out.println("Item has been added to your cart");
				addTotal(3.50);
				itemsList.add("Granola Bar");
				priceList.add("3.50");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					hikeSnacks();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 3520:
				System.out.println("Item has been added to your cart");
				addTotal(7.00);
				itemsList.add("Dried Mango");
				priceList.add("7.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					hikeSnacks();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 3521:
				System.out.println("Item has been added to your cart");
				addTotal(8.50);
				itemsList.add("Protein Cookie");
				priceList.add("8.50");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					hikeSnacks();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 5:
				Hiking();
				break;
			case 6:
				break;
			default:
				System.out.println("Please enter the appropriate input");
				input.next();
				break;
			}

		} while (loop);
	}

	public void asBikes() {
		String[] bikes = new String[3];
		double[] priceBikes = new double[3];

		int itemSKU = 8025;
		bikes[0] = "Standard Bike";
		bikes[1] = "Mountain Bike";
		bikes[2] = "Electric Bike";

		priceBikes[0] = 500.00;
		priceBikes[1] = 900.00;
		priceBikes[2] = 1899.00;

		for (int i = 0; i < bikes.length; i++) {
			System.out.println("|-------------------------------------------------------------------------------|");
			System.out.printf("| Item SKU: %d |\t\t%-13s\t\t|\t$%7.2f\t|\n", itemSKU, bikes[i], priceBikes[i]);
			itemSKU++;
		}
		System.out.println("|-------------------------------------------------------------------------------|");
		System.out.println("\n");
		System.out.println("Enter Item SKU to add to Cart\n5. Go back\n6. Close Program");
		boolean loop = false;

		do {
			int choice = 0;

			choice = validateInputBikes(choice);
			switch (choice) {
			case 8025:
				System.out.println("Item has been added to your cart");
				addTotal(500.00);
				itemsList.add("Standard Bike");
				priceList.add("500.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					asBikes();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 8026:
				System.out.println("Item has been added to your cart");
				addTotal(900.00);
				itemsList.add("Mountain Bike");
				priceList.add("900.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					asBikes();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 8027:
				System.out.println("Item has been added to your cart");
				addTotal(1899.00);
				itemsList.add("Electric Bike");
				priceList.add("1899.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					asBikes();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 5:
				ActionSports();
				break;
			case 6:
				break;
			default:
				System.out.println("Please enter the appropriate input");
				input.next();
				break;
			}

		} while (loop);
	}

	public void asHelmets() {
		String[] helmets = new String[2];
		double[] priceHelmets = new double[2];

		int itemSKU = 509;
		helmets[0] = "Small Helmet";
		helmets[1] = "Large Helmet";

		priceHelmets[0] = 50.00;
		priceHelmets[1] = 50.00;

		for (int i = 0; i < helmets.length; i++) {
			System.out.println("|-------------------------------------------------------------------------------|");
			System.out.printf("| Item SKU: %d |\t\t%-13s\t\t|\t$%7.2f\t|\n", itemSKU, helmets[i], priceHelmets[i]);
			itemSKU++;
		}
		System.out.println("|-------------------------------------------------------------------------------|");
		System.out.println("\n");
		System.out.println("Enter Item SKU to add to Cart\n5. Go back\n6. Close Program");
		boolean loop = false;

		do {
			int choice = 0;

			choice = validateInputHelmets(choice);
			switch (choice) {
			case 509:
				System.out.println("Item has been added to your cart");
				addTotal(50.00);
				itemsList.add("Small Helmet");
				priceList.add("50.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					asHelmets();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 510:
				System.out.println("Item has been added to your cart");
				addTotal(50.00);
				itemsList.add("Large Helmet");
				priceList.add("50.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					asHelmets();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 5:
				ActionSports();
				break;
			case 6:
				break;
			default:
				System.out.println("Please enter the appropriate input");
				input.next();
				break;
			}

		} while (loop);
	}

	public void snowSports() {
		String[] skiSnowboard = new String[2];
		double[] priceSkiSnowboard = new double[2];

		int itemSKU = 900;
		skiSnowboard[0] = "Ski";
		skiSnowboard[1] = "Snowboard";

		priceSkiSnowboard[0] = 1049.50;
		priceSkiSnowboard[1] = 569.95;

		for (int i = 0; i < skiSnowboard.length; i++) {
			System.out.println("|-------------------------------------------------------------------------------|");
			System.out.printf("| Item SKU: %d |\t\t%-13s\t\t|\t$%7.2f\t|\n", itemSKU, skiSnowboard[i],
					priceSkiSnowboard[i]);
			itemSKU++;
		}
		System.out.println("|-------------------------------------------------------------------------------|");
		System.out.println("\n");
		System.out.println("Enter Item SKU to add to Cart\n5. Go back\n6. Close Program");
		boolean loop = false;

		do {
			int choice = 0;

			choice = validateSnowSports(choice);
			switch (choice) {
			case 900:
				System.out.println("Item has been added to your cart");
				addTotal(1049.50);
				itemsList.add("Ski");
				priceList.add("1049.50");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					snowSports();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 901:
				System.out.println("Item has been added to your cart");
				addTotal(569.95);
				itemsList.add("Snowboard");
				priceList.add("569.95");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					snowSports();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 5:
				ActionSports();
				break;
			case 6:
				break;
			default:
				System.out.println("Please enter the appropriate input");
				input.next();
				break;
			}

		} while (loop);
	}

	public void climbGear() {
		String[] climbGear = new String[5];
		double[] priceClimbGear = new double[5];

		int itemSKU = 750;
		climbGear[0] = "Harness";
		climbGear[1] = "Carabiner";
		climbGear[2] = "Belay Device";
		climbGear[3] = "Climbing Chalk";
		climbGear[4] = "Climbing Shoes";

		priceClimbGear[0] = 120.00;
		priceClimbGear[1] = 12.95;
		priceClimbGear[2] = 110.00;
		priceClimbGear[3] = 13.95;
		priceClimbGear[4] = 130.00;

		for (int i = 0; i < climbGear.length; i++) {
			System.out.println("|-------------------------------------------------------------------------------|");
			System.out.printf("| Item SKU: %d |\t\t%-14s\t\t|\t$%7.2f\t|\n", itemSKU, climbGear[i], priceClimbGear[i]);
			itemSKU++;
		}
		System.out.println("|-------------------------------------------------------------------------------|");
		System.out.println("\n");
		System.out.println("Enter Item SKU to add to Cart\n5. Go back\n6. Close Program");
		boolean loop = false;

		do {
			int choice = 0;

			choice = validateClimbGear(choice);
			switch (choice) {
			case 750:
				System.out.println("Item has been added to your cart");
				addTotal(120.00);
				itemsList.add("Harness");
				priceList.add("120.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					climbGear();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 751:
				System.out.println("Item has been added to your cart");
				addTotal(12.95);
				itemsList.add("Carabiner");
				priceList.add("12.95");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					climbGear();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 752:
				System.out.println("Item has been added to your cart");
				addTotal(110.00);
				itemsList.add("Belay Device");
				priceList.add("110.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					climbGear();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 753:
				System.out.println("Item has been added to your cart");
				addTotal(13.95);
				itemsList.add("Climbing Chalk");
				priceList.add("13.95");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					climbGear();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}

				loop = false;
				break;
			case 754:
				System.out.println("Item has been added to your cart");
				addTotal(130.00);
				itemsList.add("Climbing Shoes");
				priceList.add("130.00");
				System.out.println("Would you like to add another item? (Y/N)");
				decision = validateInputYN(decision);

				switch (decision) {
				case "Y":
					System.out.println("You have chosen to continue shopping");
					climbGear();
					break;
				case "N":
					System.out.println("You have chosen to stop shopping");
					break;
				}
				loop = false;
				break;
			case 5:
				ActionSports();
				break;
			case 6:
				break;
			default:
				System.out.println("Please enter the appropriate input");
				input.next();
				break;
			}
     
		} while (loop);
	}

	public void itemReceipt() {
		String subTotal = "SubTotal";
		String tax = "Tax";
		String total = "TOTAL";
		System.out.println("Your receipt:");
		System.out.println("---------------------------------------------");
		System.out.println("\t\tOutdoor Store");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("\t     yyyy/MM/dd HH:mm:ss\n\n");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		for (int i = 0; i < itemsList.size(); i++) {
			System.out.printf("%-30s\t$%7s\n", itemsList.get(i), priceList.get(i));
		}
		System.out.println("---------------------------------------------");
		System.out.printf("\t\t%8s\t$%7.2f\n\t\t%8s\t$%7.2f\n\t\t%8s\t$%7.2f\n\n", subTotal, getTotal(), tax,
				(getTotal() * 0.06), total, (getTotal() * 0.06) + getTotal());
		System.out.println("---------------------------------------------");
		System.out.println("\tThank you for shopping with us!");
	}

	// Total Set/Get Methods
	public void addTotal(double p) {
		total += p;
	}

	public double getTotal() {
		return total;
	}

}
