package scanner;
import java.util.Scanner;
public class Myname {
	Scanner name = new Scanner(System.in);
	public static void main(String[] args) {
		Myname os = new Myname();
		os.readinput();
		System.out.println();
		
	}	
		
	private void readinput() {
		System.out.println("geef aub wat input in: ");
		String username = name.nextLine();
		System.out.println("de input was: " + username);
	
	}
}
