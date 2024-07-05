package surya;

public class Primenumber {
	public static void main(String[] args) {
		int n = 49;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println("It is not prime number");
			}
			else {
				System.out.println("it is prime number");
			}
		}

	}
}