package fleetOfJets;

import java.util.Scanner;

public class UserMenu {
	Scanner kb = new Scanner(System.in);
	private UserMenu menu;
	private Hangar hangar;

	public UserMenu(Hangar hangar) {
		super();
		this.hangar = hangar;
	}

	// methods:
	public void displayFastestJet(Hangar x) {
		Jets fastestJet = x.getFastestJet();
		System.out.println("The Jet that travels the fastest is: ");
		displayJetSpecs(fastestJet);
		System.out.println(" ");
	}

	public void displayLongestRangeJet(Hangar x) {
		Jets longestRangeJet = x.getLongestRangeJet();
		System.out.println("The Jet that can travel the farthest in this fleet is: ");
		displayJetSpecs(longestRangeJet);
		System.out.println(" ");
	}

	public static void displayFleet(Hangar x) {
		System.out.println("Current Fleet: ");
		System.out.println(" ");
		for (Jets jet : x.getJets()) {
			displayJetSpecs(jet);
			System.out.println(" ");
		}
	}

	public static void displayJetSpecs(Jets jet) {

		System.out.printf(jet.getTypeOfJet() + ":  Speed: Mach " + "%.2f" + ",  Range(miles):" + jet.getRange()
				+ ", Price: $" + jet.getPrice() + " M ", jet.convertSpeed());

	}

	public void addJet() {
		System.out.println("Enter Type of Jet you would like to create: ");
		String typeOfJet = kb.nextLine();
		System.out.println("Enter speed(MPH) you would like your Jet to go: ");
		int speed = kb.nextInt();
		System.out.println("Enter the range(miles) you would like your Jet to be able to travel: ");
		int range = kb.nextInt();
		System.out.println("Enter the price your jet is going to cost: ");
		double price = kb.nextDouble();
		hangar.addJets(new Jets(typeOfJet, speed, range, price));
		Jets[] updatedJets = hangar.getJets();
		System.out.println(updatedJets[updatedJets.length - 1].getTypeOfJet() + " added to hangar.");

	}

	public void displayMenu() {
		int choice;
		do {

			System.out.println("*******************************");
			System.out.println("*           <MENU>            *");
			System.out.println("*        CHOOSE OPTION        *");
			System.out.println("* 1)       LIST FLEET         *");
			System.out.println("* 2)   DISPLAY FASTEST JET    *");
			System.out.println("* 3)DISPLAY LONGEST RANGE JET *");
			System.out.println("* 4)   ADD JET TO FLEET       *");
			System.out.println("* 5)        QUIT              *");
			System.out.println("*******************************");

			choice = kb.nextInt();

			if (choice == 1) {
				displayFleet(hangar);
			} else if (choice == 2) {
				displayFastestJet(hangar);
			} else if (choice == 3) {
				displayLongestRangeJet(hangar);
			} else if (choice == 4) {
				kb.nextLine();
				addJet();
			} else if (choice == 5) {
				System.out.println("Thank you for viewing my distinguised fleet of Jets!");
				System.out.println("You have now exited the program...");
				break;
			}
		} while (choice != 5);

	}
}
