package bankrekening;

public class Bankrekening {
												
	public double bedrag = 0.0;
	

	public void addmoney(double money) {
		bedrag = bedrag + money;
	}
	public void withdrawlmoney(double money) {
		bedrag = bedrag - money;
	}
}
