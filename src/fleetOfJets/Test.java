package fleetOfJets;

public class Test {

	public static void main(String[] args) {

		Hangar hangar = new Hangar();

		Jets[] jets = new Jets[5];

		jets[0] = new Jets("Boeing-787", 593, 9439, 189_000_000);
		jets[1] = new Jets("Airbus-A380", 559, 9755, 375_300_000);
		jets[2] = new Jets("McDonnell Douglas-DC10", 600, 6000, 145_000_000);
		jets[3] = new Jets("F-15", 1650, 3450, 30_000_000);
		jets[4] = new Jets("F-22", 1500, 1840, 150_000_000);

		hangar.setJets(jets);

		UserMenu menu = new UserMenu(hangar);
		menu.displayMenu();

	}
}