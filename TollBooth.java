public class TollBooth {
	private int receiptsTotal;

	private int truckTotal;

	public TollBooth() {
		receiptsTotal = 0;

		truckTotal = 0;
	}

	public int calculateAmountDue(int numAxles, int weight) {
		int amountDue = (int)(5*numAxles + 10*((float)weight/1000));
		return amountDue;
	}

	public void truckArrival(Truck truck) {
		int numAxles = truck.getNumAxles();
		int weight = truck.getWeight();
		int amountDue = calculateAmountDue(numAxles, weight);
		receiptsTotal = receiptsTotal + amountDue; // divided by 1000 because calculated by half-ton
		truckTotal++;
		System.println("Truck Arrival - Axles: " + numAxles + " Total Weight: " + weight + " Total due: " + amountDue);
		// Truck arrival - Axles: 5, Total weight: 12500, Total due: 150
	}

	public void collectingReceipts() {
		System.println("***Collecting Receipts***");
		totalsSinceLastCollection();
		receiptsTotal = 0;
		truckTotal = 0;

		// System.println("Totals since last collection: Receipts-" + receiptsTotal + " Trucks-" + truckTotal);

	}

	public void totalsSinceLastCollection() {
		System.println("Totals since last collection: Receipts-" + receiptsTotal + " Trucks-" + truckTotal);
		// Totals since last collection - Receipts: $330, Trucks: 2
	}
}