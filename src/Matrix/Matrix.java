package Matrix;

public class Matrix {

	public static void main(String[] args) {
		Matrix matrix = new Matrix();
		matrix.array();
	}
	public void array() {
		double[][] a = new double[10][15];
		
		
		for(int i = 0; i < a.length ; i++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = Math.random();
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
