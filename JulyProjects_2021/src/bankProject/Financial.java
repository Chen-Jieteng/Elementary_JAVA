package bankProject;

public class Financial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double taxRate = 0.01;
		double total = 100;
		double tax = Financial.percentOf(taxRate, total);

	}
	public static double percentOf(double percentage, double amount) {
		return (percentage / 100) * amount;
	}
}
