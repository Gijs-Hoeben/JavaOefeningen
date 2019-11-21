package ifelse;

public class ifelse1 {

	public static void main(String[] args) {
		
		ifelse1 getal1 = new ifelse1();
		boolean x = getal1.controledubel(2.5);
		System.out.println(x);
	}
	
	public boolean controledubel(double a) {
		if( a > 0 && a < 1) {
			return true;
		} 
		else {
			return false;
		}
		}
}
