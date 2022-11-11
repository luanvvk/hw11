
package hw10;

class MinimumGap {
	public static int getMinDistance(int[] arr) {

		int count = -1;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count = j;
				}
				min = Math.min(min, count - i);
			}
		}
		return min = Math.abs(min);
	}

	public static void main(String args[]) {

		// Test Case 1:
		int a1[] = { 1, 2, 3, 2, 1 };
		System.out.println(getMinDistance(a1));

		// Test Case 2:
		int a2[] = { 3, 5, 4, 6, 5, 3 };
		System.out.println(getMinDistance(a2));

		// Test Case 3:
		int a3[] = { 1, 2, 1, 4, 1 };
		System.out.println(getMinDistance(a3));
	}
}
//O(n^2)