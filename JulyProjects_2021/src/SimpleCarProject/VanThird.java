package SimpleCarProject;

public class VanThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private int remainingTrips;
	private String location;
	public VanThird() {
		remainingTrips = 15;
		location ="garage";
	}
	public void drive() {
		if(location.equals("gas station")) {
			remainingTrips = 15;
			location = "terminal";
		}
		else {
			remainingTrips--;
			if(remainingTrips == 0) {
				location = "gas station";
			}
			else if(location.equals("terminal")) {
				location = "garage";
			}
		}
	}
}
