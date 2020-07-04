public class Truck {
	private int numAxles;

	private int weight;

	// constructor
	public Truck(int truckNumAxles, int truckWeight) {
	// initialize instance variables here	
		this.numAxles = truckNumAxles;

		this.weight = truckWeight;
	}

	public int getNumAxles() {
		return numAxles;
	}

	public int getWeight() {
		return weight;
	}
}
