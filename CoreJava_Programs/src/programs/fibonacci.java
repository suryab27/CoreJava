package programs;

public class fibonacci {
	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3, i, last = 25;
		System.out.print(n1 + " " + n2);
		for (i = 2; i < last; ++i) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
}
