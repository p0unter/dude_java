package pounter.arrays;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] arr;
		int arr2[];
		
		arr = new int[10];
		System.out.println(arr.length);
//		System.out.println(arr[0]);
		
		double[] arr3 = new double[10];
//		System.out.println(arr3[0]);
		
		boolean[] arr4 = new boolean[10];
//		System.out.println(arr4[0]);
		
		System.out.println(arr4[10]);
		
		int[] arr5 = { 3, 2, 1 };
		
		int[][] matrix = {
			{ 3, 5, 2 },
			{ 4, 2, 4 }
		};
		
		System.out.println(matrix[0][2]);
		
		int[][] matrix2 = new int[10][0];
		System.out.println(matrix2[0]); // null
		
		System.out.println(Arrays.toString(arr5));
		
/* OR
 *	System.out.println(java.util.Arrays.toString(arr5));
 */
		
		Arrays.sort(arr5);
		System.out.println(Arrays.toString(arr5)); // [1, 2, 3]
	}

}
