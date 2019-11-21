package DoubleForLoop;

public class Doubleforloop {

	public static void main(String[] args) {
		Doubleforloop doubleloop = new Doubleforloop();
		doubleloop.forfor();
	}
	public void forfor() {
		
		
		for (int i = 0; i < 4 ; i++) {
			for (int j = 1; j < 7 ; j++) {
				if(j < 7 && j > 1) {
				System.out.print(", ");
				}
				System.out.print(j);
			}
			System.out.println();
		}	
		
	}
}
