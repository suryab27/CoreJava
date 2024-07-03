package programs;

public class Palindrome {

	public static void main(String[] args) {
		String S1 = "Madam";
		for (int i = S1.length() - 1; i >= 0; i--) {
			char temp = S1.charAt(i);
			System.out.print(temp);
		}

	}
}
