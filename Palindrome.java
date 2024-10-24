package practice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		String reverse = new StringBuilder(str).reverse().toString();
		System.out.println(str.equals(reverse));

	}

}
