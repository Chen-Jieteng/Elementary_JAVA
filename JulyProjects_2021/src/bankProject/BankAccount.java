package bankProject;

public class BankAccount {
	private double balance;
	private int accountNumber;
	private static int lastAssignedNumber = 1000;
	// public static final double OVERDRFT_FEE = 29.95;
	
	public BankAccount() {
		lastAssignedNumber++;
		accountNumber = lastAssignedNumber;
	}
}
