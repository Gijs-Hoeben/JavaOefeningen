package scanner;
import java.util.Scanner;
public class Optellen {
	Scanner getal1 = new Scanner(System.in);
	Scanner getal2 = new Scanner(System.in);
	public static void main(String[] args) {
		Optellen optel = new Optellen();
		optel.readinput();
		System.out.println();
	}
	private void readinput() {
		System.out.println("geef een getal op");
		int uitkomst1 = getal1.nextInt();
		System.out.println("geef een ander getal op");
		int uitkomst2 = getal2.nextInt();
		int einduitkomst = uitkomst1 + uitkomst2;
		System.out.println("de uitkomst is: " + einduitkomst);
	}

}
