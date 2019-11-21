package Evengetallen;

public class Evengetallen {

	public static void main(String[] args) {
		Evengetallen evengetal = new Evengetallen();
		evengetal.array();
		
	}
	public void array() {
		int[] getal = new int[100];
		
		for(int i = 0; i < getal.length; i++) {
			getal[i] = i;
		}
		for(int i = 0; i < getal.length; i++) {
			if(i % 2 == 0) {
				System.out.println(getal[i]);
			}
		}
	}
}
