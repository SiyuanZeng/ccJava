package Question8_4;

public class ParkingLot {
    public static final int NUMBER_SPOTS = 30;
    private Level[] levels;
	private static final int NUM_LEVELS = 5;
	
	public ParkingLot() {
		levels = new Level[NUM_LEVELS];
		for (int i = 0; i < NUM_LEVELS; i++) {
			levels[i] = new Level(i, NUMBER_SPOTS);
		}
	}
	
	/* Park the vehicle in a spot (or multiple spots). Return false if failed. */
	public boolean parkVehicle(Vehicle vehicle) {
		for (int i = 0; i < levels.length; i++) {
			if (levels[i].parkVehicle(vehicle)) {
				return true;
			}
		}
		return false;
	}
	
	public void print() {
		for (int i = 0; i < levels.length; i++) {
			System.out.print("Level" + i + ": ");
			levels[i].print();
			System.out.println("");
		}
		System.out.println("");
	}
}
