package SimpleCarProject;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private double odometer; //¿Ô≥Ã±Ì
	public Car() {
		odometer = 0;
	}
	public void drive(double miles) {

		odometer = odometer + miles;
	}
	public double getOdometer() {
		return odometer;
	}
}
