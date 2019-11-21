package ExtraOefeningenArrays;

public class StringOmdraaien {

	public static void main(String[] args) {
		
		StringOmdraaien reverse = new StringOmdraaien();
		String omgedraaidestring = reverse.stringreverse("Dit is een zin");
		System.out.println(omgedraaidestring);
		

	}

	public String stringreverse(String a){
		char[] caracters = new char[a.length()];
		for(int i = 0; i < caracters.length; i++ ) {
			caracters[a.length()- i - 1 ] = a.charAt(i);
					
		}
		
		String b = "";
		
		for(int i = 0; i < caracters.length; i++) {
			b = b + caracters[i];
		}
		
		return b;
	}
}
