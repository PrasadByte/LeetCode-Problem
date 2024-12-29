package basic_program;


public class Practice {

	public static boolean isPalindrome(String str) {
		int left=0;
		int right=str.length()-1;
		str=str.toLowerCase();
		while(left<right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
				
			}
			right--;
			left++;
		}
		return true;
	}
	public static void main(String[] args) {
		String darsh="ama";
		System.out.println(darsh + " is palindrome " + isPalindrome(darsh));
	}

}
