package project_euler;

public class P004 {

	public static void main(String[] args) {
		int palindrome = 0;
		for (int num1 = 0; num1 < 1000; num1++ ) {
			for (int num2 = 0; num2 < 1000; num2++) {
				int total = num1*num2;
				if (total > palindrome && isPalindrome(total)) {
					palindrome = total;
				}
			}
		}
		
		
		System.out.print(palindrome);
	}
	
	public static boolean isPalindrome(int num) {
		boolean palindrome = true;
		String numStr = Integer.toString(num);
		int len = numStr.length();
		for (int i = 0; i < len/2; i++) {
			if (numStr.charAt(i) != numStr.charAt(len-i-1)) {
				palindrome = false;
			}
		}
		
		return palindrome;
		
	}
}
