public class TollBoothTester {
	public static void main(String[] args) {
		Truck truck1 = new Truck(6, 12000); 
		Truck truck2 = new Truck(5, 12500);
		Truck truck3 = new Truck(5, 12000);
		TollBooth booth1 = new TollBooth();
		booth1.truckArrival(truck1); // Truck Arrival - Axles:6 Total Weight: 12000 Total Due: 150
		booth1.truckArrival(truck2); // Truck Arrival - Axles:5 Total Weight: 12500 Total Due: 150
		booth1.totalsSinceLastCollection(); // Totals since last collection - Receipts: $300, Trucks: 2
		booth1.truckArrival(truck3); // Truck Arrival - Axles:5 Total Weight: 12000 Total Due: 145
		booth1.collectingReceipts(); // ***Collecting Receipts*** .... Totals since last collection - Receipts: $445, Trucks: 3
	}
}