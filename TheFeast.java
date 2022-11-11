package hw10;

public class TheFeast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 16;
		int c = 3;
		int m = 2;

		int totalChoc = n / c;
		int wrapper = totalChoc;
		totalChoc = totalChoc + wrapper / m;

		while (wrapper >= m) {
			wrapper = wrapper / m + wrapper % m;
			totalChoc = totalChoc + wrapper / m;
		}

		System.out.println(totalChoc);

	}

}
//O(n)