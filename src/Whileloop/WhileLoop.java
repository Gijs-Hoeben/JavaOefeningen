package Whileloop;

public class WhileLoop {

	public static void main(String[] args) {
		WhileLoop whileloop = new WhileLoop();
		whileloop.whilee();
	}
	public void whilee() {
		int getal = 1;
		while(getal < 6) {
			System.out.print(getal++);
		}
		System.out.println();
	}
}
