package SimpleCarProject;

public class Van {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private int capacity;
	private int count;
	public Van(int maxPassengers) {
		count = 0;
		capacity = maxPassengers;
	}
	public void board() {
		if(count < capacity) {
			count++;
		}
	}
	public void drive() {
		count = 0;
	}
	

}
