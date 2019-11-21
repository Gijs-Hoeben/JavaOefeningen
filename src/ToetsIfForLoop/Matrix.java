package ToetsIfForLoop;

public class Matrix {

	public static void main(String[] args) {
		Matrix mat = new Matrix();
		mat.array();
	}

	public void array() {

		

		int[][] a = new int[10][15];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (i+1) * (j+1);
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}
