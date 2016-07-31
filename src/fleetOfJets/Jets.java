package fleetOfJets;

public class Jets extends Hangar {
	private String typeOfJet;
	private int speed;
	private int range;
	private double price;

	public Jets(String typeOfJet, int speed, int range, double price) {
		super();
		this.typeOfJet = typeOfJet;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jets [typeOfJet=" + typeOfJet + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}

	public double convertSpeed() {
		return ((double) this.speed / 767.269);
	}

	public String getTypeOfJet() {
		return typeOfJet;
	}

	public void setTypeOfJet(String typeOfJet) {
		this.typeOfJet = typeOfJet;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
