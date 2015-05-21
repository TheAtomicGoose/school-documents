public class Matrix {

	private int[][] mat;

	public Matrix(int[][] m) {
		mat = m;
	}

	public void reverseAllRows() {
		for (int r = 0; r < mat.length; r++) {
			ArrayTest.reverseArray(mat[r]);
		}
	}

	public void reverseMatrix() {
		reverseAllRows();

		for (int i = 0; i < mat.length / 2; i++) {
			int[] temp = new int[mat.length];
			temp = mat[i];
			mat[i] = mat[mat.length - 1 - i];
			mat[mat.length - 1 - i] = temp;
		}
	}
}