package SimplePurchaseProject;

public class Purchase {
	private double purchase;
	
	public void recordPurchase(double amount) {
		purchase = purchase + amount;
	}
	
	public void clear() {
		purchase = 0;
	}
	
	public double getDueAmount() {
		return purchase;
	}
}

