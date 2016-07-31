package fleetOfJets;

public class Hangar {
	// MAKE ARRAY OF JETS
	private Jets[] jets;

	// MAKE OBJ OF THIS CLASS TO STORE JET ARRAY IN
	public Hangar() {
		this(new Jets[0]);
	}

	// CONSTRUCTOR
	public Hangar(Jets[] jets) {
		this.jets = jets;
	}

	// METHODS
	public void addJets(Jets j) {
		Jets[] user = new Jets[jets.length + 1]; // "adding to array"
		for (int i = 0; i < jets.length; i++) {
			user[i] = jets[i];
		}
		user[user.length - 1] = j;
		setJets(user);

	}

	public Jets getFastestJet() {
		int fastestSpeed = 0;
		Jets fastestJet = null;

		for (Jets jet : getJets()) {
			if (jet.getSpeed() > fastestSpeed) {
				fastestSpeed = jet.getSpeed();
				fastestJet = jet;
			}
		}
		return fastestJet;
	}

	public Jets getLongestRangeJet() {
		int longestRange = 0;
		Jets longestRangeJet = null;

		for (Jets jet : getJets()) {

			if (jet.getRange() > longestRange) {
				longestRange = jet.getRange();
				longestRangeJet = jet;
			}
		}
		return longestRangeJet;
	}

	public Jets[] getJets() {
		return jets;
	}

	public void setJets(Jets[] jets) {
		this.jets = jets;
	}

}
