package ifelse;

public class ifelse3 {

	public static void main(String[] args) {
		
		ifelse3 ifelse = new ifelse3();
		int kleinste = ifelse.geefkleinstegetalterug(145151545, 94932597);
		System.out.println(kleinste);

	}
	public int geefkleinstegetalterug(int a , int b) {
		if(a < b) {
			return a;
		} else {
			return b;
		}
	}

}
