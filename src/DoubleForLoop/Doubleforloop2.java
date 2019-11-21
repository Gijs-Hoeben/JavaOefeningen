package DoubleForLoop;

public class Doubleforloop2 {

	public static void main(String[] args) {
		Doubleforloop2 doubleforloop = new Doubleforloop2();
		doubleforloop.forfor();
	}
	public void forfor() {
		
		String text = "Outer loop iteration ";
		
		for (int i = 1; i < 6; i++) {
			System.out.println(text + i );
			for (int j = 1; j < 3 ; j++) {
				System.out.println("i = " + i + "; j = " + j);
				
			}
			System.out.println();
		}
	}
}
