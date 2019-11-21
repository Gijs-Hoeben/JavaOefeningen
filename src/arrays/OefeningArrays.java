package arrays;

public class OefeningArrays {

	public static void main(String[] args) {
		OefeningArrays oefeningarrays = new OefeningArrays();
		oefeningarrays.array();
	}
	public void array() {
		int[] getal = new int[10];
		
		
		for(int i = 0; i < getal.length; i++) {
			getal[i] = i * 50;
		}
		
		for(int i = 0; i < getal.length; i++) {
			System.out.println(getal[i]);
		}
	}
}
