
/**
 * 
 * @author Ethan F. Austin S.
 *
 */
public class AlgorithmProject {

	static int counter1 = 0;
	static int counter2 = 0;
	static int counter3 = 0;

	public static boolean swap(int a, int b) {
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		return false;
	}

	/**
	 * Sorting Algorithm that makes 
	 * @param A-
	 *            array of integer values
	 * @param i
	 *            - integer
	 * @return - boolean, true or false
	 */
	public static boolean ALG1(int[] A, int i) {
		counter3++;
		if (i == A.length -1) {
			for (int j = 0; j <= A.length - 2; j++) {
				counter1++;
				if (A[j] > A[j + 1]) {
					return false;
				}
			}
			return true;
		}
		for (int r = i; r < A.length; r++) {
			counter2++;
			swap(A[i], A[r]);
			if (ALG1(A, i + 1)) {
				return true;
			}
			swap(A[i], A[r]);
		}
		return false;
	}

	/**
	 * 
	 * @param A
	 *            - array of integers
	 * @param B
	 *            - array of zeroes
	 * @param i
	 *            - integer
	 */
	public static void ALG2(int[] A, int[] B, int i) {
		if (i >= A.length) {
			for (int j = 0; j < A.length; j++) {
				/**
				 * counter++; System.out.print(counter);
				 */
				if (B[j] > 0) {
					System.out.printf(B[j] + "\n");
				}
			}
			return;
		}
		B[i] = 0;
		/**
		 * counter++; System.out.print(counter);
		 */
		ALG2(A, B, i + 1);
		/**
		 * counter++; System.out.print(counter);
		 */
		B[i] = A[i];
		ALG2(A, B, i + 1);
		B[i] = 0;
	}

	public static void main(String args[]) {
		int[] A = { 1, 6, 4, 3 };
		int[] B = { 0, 0, 0, 0 };
		int i = 0;
		ALG2(A, B, i);
		//ALG1(A,i);
		//System.out.println(counter1);
		//System.out.println(counter2);
		//System.out.println(counter3);
		for(int g = 0; g<B.length; g++){
			System.out.print(B[g]);
		}
	}
}
