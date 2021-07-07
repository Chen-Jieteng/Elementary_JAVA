package busProject;

public class Bus {
	private int street;
	private int direction;
	
	public Bus() {
		direction = 1;
		street = 1;
	}
	public void drive() {
		if(street == 20 && direction == 1 || street == 1 && direction == -1) {
			direction = -direction;
		}
		street = street + direction;
	}
	public int getLocation() {
		return street;
	}
}
