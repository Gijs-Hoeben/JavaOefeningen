package bankrekening;

public class Bank {

	public static void main(String[] args) {
		Bankrekening zichtrekening = new Bankrekening();
		System.out.println(zichtrekening.bedrag);
		zichtrekening.addmoney(40.0);
		System.out.println(zichtrekening.bedrag);
		zichtrekening.withdrawlmoney(10.0);
		System.out.println(zichtrekening.bedrag);
	}

	

}
