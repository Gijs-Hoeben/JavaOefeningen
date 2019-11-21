package ToetsIfForLoop;

public class Char {

	public static void main(String[] args) {
		Char character = new Char();
		String zin = "zin";
		int getal = 1;
		
		for (int i = 0; i < zin.length(); i++) {
			System.out.println("Charater " + (i+1) + ": " + zin.charAt(i));
		}
	}
	
}
