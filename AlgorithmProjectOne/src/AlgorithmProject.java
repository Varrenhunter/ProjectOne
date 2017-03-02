
/**
 * 
 * @author Ethan F. Austin S.
 *
 */

import java.util.Random;
public class AlgorithmProject {

	static int counter1 = 0;
	static int counter2 = 0;
	static int counter3 = 0;
/* This code actually does nothing, it swaps the values locally only
	public static boolean swap(int a, int b) {
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		return false;
	}*/
	public static int[] swap(int a, int b){
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		int[] H = {a,b};
		return H;
	}

	/**
	 * Sorting Algorithm that makes 
	 * @param A-
	 *            array of integer values
	 * @param i
	 *            - integer
	 * @return - boolean, true or false
	 * 
	 * worst case: i=0,1
	 * 			 : {9,8,7,6,5,4,3,2,1,0}
	 * Should be n!
	 */
	public static boolean ALG1(int[] A, int i) {
		//counter3++;
		if (i == A.length ) {
			for (int j = 1; j < A.length - 1; j++) {
				counter1++;
				if (A[j] > A[j + 1]) {
					return false;
				}
			}
			return true;
		}
		for (int r = i; r < A.length; r++) {
			counter1++;
			int[] temp = swap(A[i], A[r]);
			A[i] = temp[0];
			A[r] = temp[1];
			if (ALG1(A, i + 1)) {
				return true;
			}
			temp = swap(A[i], A[r]);
			A[i] = temp[0];
			A[r] = temp[1];
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
	 *            
	 *            2^n
	 */
	public static void ALG2(int[] A, int[] B, int i) {
		if (i >= A.length-1) {
			for (int j = 0; j < A.length-1; j++) {
				
				counter1++;
				 
				if (B[j] > 0) {
					//Fix printing to use a delimiter
					System.out.print(B[j] + ", ");
				}
			}
			System.out.println();
			return;
		}
		B[i] = 0;
		
		//counter2++;
		 
		ALG2(A, B, i + 1);
		
		//counter3++; 
		 
		B[i] = A[i];
		ALG2(A, B, i + 1);
		B[i] = 0;
	}

	public static void main(String args[]) {
		/*
		//populate A with random numbers
		Random rand = new Random();
		int arrayLength = 10;
		int[] A = new int[arrayLength];
		for(int j = 0; j<arrayLength; j++){
			A[j] = rand.nextInt(49)+1;
		}
		System.out.print("I am array A: ");
		for(int j = 0; j<A.length; j++){
			System.out.print(A[j] + ", ");
		}
		System.out.println();
		
		//populate B with arrayLength values
		int[] B = new int[arrayLength];
		for(int j = 0; j<B.length; j++){
			B[j] = 0;
		}
		for(int j = 0; j<B.length; j++){
			System.out.print(B[j] + ", ");
		}
		System.out.println();
		*/
		int[] A = {9,8,7,6,5,4,3,2,1,0};//,4,3,2,1,0};
		int[] B = {0,0,0,0,0,0,0,0,0,0};//,0,0,0,0};
		int i = 0;
		ALG2(A, B, i);
		//ALG1(A,i);
		System.out.println("counter 1: " + counter1);
		//System.out.println("counter 2: " + counter2);
		//System.out.println("counter 3: " + counter3);
		System.out.print("A: ");
		for(int g = 0; g<A.length; g++){
			System.out.print(A[g] + ", ");
		}
		System.out.println("");
		System.out.print("B: ");
		for(int g = 0; g<B.length; g++){
			System.out.print(B[g]);
		}
		
	}
}
