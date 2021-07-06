package SimplePurchaseProject;

// ÓÐCounterµÄ
public class PurchaseSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private double purchase;
	private int itemCount;
	
	public void purchaseRecord(double amount) {
		purchase = purchase + amount;
		itemCount++;
	}
	public void Clear() {
		purchase = 0;
		itemCount = 0;
	}
	
	public double finalDue() {
		return purchase;
	}

}
