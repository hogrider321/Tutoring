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

public class TollBooth {
	private int receiptsTotal;

	private int truckTotal;

	public TollBooth() {
		receiptsTotal = 0;

		truckTotal = 0;
	}

	public void truckArrival(Truck truck) {
		return numAxles;
		return weight;
		int amountDue = 5*numAxled + 10*(weight/1000);
		receiptsTotal = receiptsTotal + amountDue; // divided by 1000 because calculated by half-ton
		truckTotal++;
	}

	public void collectingReceipts() {
		receiptsTotal = 0;
		truckTotal = 0;
	}

	public void totalsSinceLastCollection() {
		return receiptsTotal;
		return truckTotal
	}

	// what are private helper methods, again???