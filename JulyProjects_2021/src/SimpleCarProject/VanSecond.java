package SimpleCarProject;

public class VanSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private String[] passengers;
	private int count;
	public VanSecond(int maxPassengers) {
		count = 0;
		passengers = new String[maxPassengers];
	}
	public void board(String name) {
		if(count < passengers.length) {
			passengers[count] = name;
			count++;
		}
	}
	public void drive() {
		count = 0;
	}
}
