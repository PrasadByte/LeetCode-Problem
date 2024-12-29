package basic_program;

public class PalindromeChecker {
	public static boolean isPalindrome(String str) {
		int left=0;
		int right=str.length()-1;
		//convert thr string to lower case to igonre case senstive 
		str=str.toLowerCase();
		while(left<right) {
			if(str.charAt(right)!=str.charAt(left)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		String str="Prasad";
		System.out.println(str + "is Palindrome " + isPalindrome(str));

	}

}
