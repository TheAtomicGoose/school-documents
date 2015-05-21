public class Test {

	public static void main(String[] args) {
		
		// int[] array = {1, 2, 3, 4, 5, 6};
		// reverseArray(array);

		// for (int item: array) {
		// 	System.out.print(item + " ");
		// }
		// System.out.println();

		// int[][] mat = {{1, 2, 3, 4},
		// 			   {5, 6, 7, 8},
		// 			   {9, 10, 11, 12}};

		// Matrix matrix = new Matrix(mat);

		// matrix.reverseMatrix();

		// for (int[] arr: mat) {
		// 	for (int item: arr) {
		// 		System.out.print(item + " ");
		// 	}
		// 	System.out.println();
		// }

		// Sentence s = new Sentence("My name is Jesse.");

		// System.out.println(s.countWords());

		// String[] strArr = s.getWords();

		// for (String str: strArr) {
		// 	System.out.print(str);
		// }
		// System.out.println();

		Tournament t = new Tournament();

		for (int i = 0; i < 11; i++) {
			t.requestSlot("Jesse");
		}
	}


	public static void reverseArray(int[] arr) {
		int[] temp = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}

		for (int i = 0; i < temp.length; i++) {
			arr[i] = temp[temp.length - 1 - i];
		}
	}
}