package MovingObject;

public class MovingObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	private double distanceFromTerminus;
	
	private int row;
	private int col;
	private int direction; //À≥ ±’Î0123
	
	private double zPosition;
	private double zVelocity;
	
	public void move(double distanceMoved) {
		distanceFromTerminus = distanceFromTerminus + distanceMoved;
	}
	public void moveOneUnit() {
		if(direction == 0) {
			row--;
		}
		else if(direction == 1) {
			col++;
		}
		else if(direction == 2) {
			row++;
		}
		else if(direction == 3) {
			col--;
		}
	}

}
