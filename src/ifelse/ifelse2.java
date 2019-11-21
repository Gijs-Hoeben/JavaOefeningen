package ifelse;

public class ifelse2 {

	public static void main(String[] args) {
		
		ifelse2 ifelse = new ifelse2();
		int grootste = ifelse.geefgrootsteterug(7, 9);
		System.out.println(grootste);
		
		
	}
	public int geefgrootsteterug(int a , int b) {
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}

}
