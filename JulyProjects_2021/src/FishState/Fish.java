package FishState;

public class Fish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private int hungry; 
	public static final int NOT_HUNGRY = 0;
	public static final int MED_HUNGEY = 1;
	public static final int VERY_HUNGRY = 2;

	public void eat() {
		hungry = NOT_HUNGRY;
	}
	public void move() {
		if(hungry < VERY_HUNGRY) {
			hungry++;
		}
		if(hungry == VERY_HUNGRY) {
			// look for the foods.
		}
	}
}
