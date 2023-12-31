package outdoorStore;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainUtil {
	public static Scanner input = new Scanner(System.in);

	// Menu Prompt method
	public void menuPrompt(String categName) {
		System.out.println("You are in the " + categName + " department\n");
	}

	// Validation Methods
	public int validateInputmyMenu(int userInput) {

		boolean validInput = false;

		while (!validInput) {
			try {
				userInput = input.nextInt();
				if (userInput <= 4 && userInput >= 1) {
					validInput = true;
				} else {
					input.nextLine();
					System.out.println("Please enter a menu choice");
					validInput = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Please enter a menu choice");
				input.nextLine();
				validInput = false;
			}
		}
		return userInput;

	}

	public int validateInputCHA(int userInput) {

		boolean validInput = false;

		while (!validInput) {
			try {
				userInput = input.nextInt();
				if (userInput <= 6 && userInput >= 1) {
					validInput = true;
				} else {
					input.nextLine();
					System.out.println("Please enter a menu choice");
					validInput = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Please enter a menu choice");
				input.nextLine();
				validInput = false;
			}
		}
		return userInput;

	}

	public int validateInputTents(int userInput) {

		boolean validInput = false;

		while (!validInput) {
			try {
				userInput = input.nextInt();
				if (userInput <= 6 && userInput >= 5 || userInput <= 1403 && userInput >= 1401) {
					validInput = true;
				} else {
					input.nextLine();
					System.out.println("Please enter a menu choice");
					validInput = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Please enter a menu choice");
				input.nextLine();
				validInput = false;
			}
		}
		return userInput;

	}

	public int validateInputSleepBags(int userInput) {

		boolean validInput = false;

		while (!validInput) {
			try {
				userInput = input.nextInt();
				if (userInput <= 6 && userInput >= 5 || userInput <= 5213 && userInput >= 5211) {
					validInput = true;
				} else {
					input.nextLine();
					System.out.println("Please enter a menu choice");
					validInput = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Please enter a menu choice");
				input.nextLine();
				validInput = false;
			}
		}
		return userInput;

	}

	public int validateInputCampKitchen(int userInput) {

		boolean validInput = false;

		while (!validInput) {
			try {
				userInput = input.nextInt();
				if (userInput <= 6 && userInput >= 5 || userInput <= 1556 && userInput >= 1555
						|| userInput <= 3513 && userInput >= 3512 || userInput == 4504) {
					validInput = true;
				} else {
					input.nextLine();
					System.out.println("Please enter a menu choice");
					validInput = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Please enter a menu choice");
				input.nextLine();
				validInput = false;
			}
		}
		return userInput;

	}

	public int validateInputES(int userInput) {

		boolean validInput = false;

		while (!validInput) {
			try {
				userInput = input.nextInt();
				if (userInput <= 6 && userInput >= 5 || userInput == 7002 || userInput == 5550) {
					validInput = true;
				} else {
					input.nextLine();
					System.out.println("Please enter a menu choice");
					validInput = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Please enter a menu choice");
				input.nextLine();
				validInput = false;
			}
		}
		return userInput;

	}

	public int validateInputHikeBackpacks(int userInput) {

		boolean validInput = false;

		while (!validInput) {
			try {
				userInput = input.nextInt();
				if (userInput <= 6 && userInput >= 5 || userInput <= 9802 && userInput >= 9800) {
					validInput = true;
				} else {
					input.nextLine();
					System.out.println("Please enter a menu choice");
					validInput = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Please enter a menu choice");
				input.nextLine();
				validInput = false;
			}
		}
		return userInput;

	}

	public int validateInputHikePoles(int userInput) {

		boolean validInput = false;

		while (!validInput) {
			try {
				userInput = input.nextInt();
				if (userInput <= 6 && userInput >= 5 || userInput <= 2102 && userInput >= 2100) {
					validInput = true;
				} else {
					input.nextLine();
					System.out.println("Please enter a menu choice");
					validInput = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Please enter a menu choice");
				input.nextLine();
				validInput = false;
			}
		}
		return userInput;

	}

	public int validateInputHikeBottles(int userInput) {

		boolean validInput = false;

		while (!validInput) {
			try {
				userInput = input.nextInt();
				if (userInput <= 6 && userInput >= 5 || userInput <= 106 && userInput >= 105) {
					validInput = true;
				} else {
					input.nextLine();
					System.out.println("Please enter a menu choice");
					validInput = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Please enter a menu choice");
				input.nextLine();
				validInput = false;
			}
		}
		return userInput;

	}

	public int validateInputHikeSnacks(int userInput) {

		boolean validInput = false;

		while (!validInput) {
			try {
				userInput = input.nextInt();
				if (userInput <= 6 && userInput >= 5 || userInput <= 3521 && userInput >= 3519) {
					validInput = true;
				} else {
					input.nextLine();
					System.out.println("Please enter a menu choice");
					validInput = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Please enter a menu choice");
				input.nextLine();
				validInput = false;
			}
		}
		return userInput;

	}

	public int validateInputBikes(int userInput) {

		boolean validInput = false;

		while (!validInput) {
			try {
				userInput = input.nextInt();
				if (userInput <= 6 && userInput >= 5 || userInput <= 8027 && userInput >= 8025) {
					validInput = true;
				} else {
					input.nextLine();
					System.out.println("Please enter a menu choice");
					validInput = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Please enter a menu choice");
				input.nextLine();
				validInput = false;
			}
		}
		return userInput;

	}

	public int validateInputHelmets(int userInput) {

		boolean validInput = false;

		while (!validInput) {
			try {
				userInput = input.nextInt();
				if (userInput <= 6 && userInput >= 5 || userInput <= 510 && userInput >= 509) {
					validInput = true;
				} else {
					input.nextLine();
					System.out.println("Please enter a menu choice");
					validInput = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Please enter a menu choice");
				input.nextLine();
				validInput = false;
			}
		}
		return userInput;

	}

	public int validateSnowSports(int userInput) {

		boolean validInput = false;

		while (!validInput) {
			try {
				userInput = input.nextInt();
				if (userInput <= 6 && userInput >= 5 || userInput <= 901 && userInput >= 900) {
					validInput = true;
				} else {
					input.nextLine();
					System.out.println("Please enter a menu choice");
					validInput = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Please enter a menu choice");
				input.nextLine();
				validInput = false;
			}
		}
		return userInput;

	}

	public int validateClimbGear(int userInput) {

		boolean validInput = false;

		while (!validInput) {
			try {
				userInput = input.nextInt();
				if (userInput <= 6 && userInput >= 5 || userInput <= 754 && userInput >= 750) {
					validInput = true;
				} else {
					input.nextLine();
					System.out.println("Please enter a menu choice");
					validInput = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Please enter a menu choice");
				input.nextLine();
				validInput = false;
			}
		}
		return userInput;

	}

	public String validateInputYN(String userInput) {
		boolean validInput = false;
		while (!validInput) {
			try {
				userInput = input.next();
				if (userInput.equals("Y") || userInput.equals("N")) {
					validInput = true;
				} else {
					input.nextLine();
					System.out.println("Please enter a menu choice");
					validInput = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Please enter a menu choice");
				input.nextInt();
				validInput = false;
			}
		}
		return userInput;
	}

}
