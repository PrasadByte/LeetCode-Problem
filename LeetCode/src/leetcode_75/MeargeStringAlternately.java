package leetcode_75;

public class MeargeStringAlternately {
	public static String mergealternately(String world1, String world2) {
		StringBuilder merge=new StringBuilder();
		int n1=world1.length();
		int n2=world2.length();
		int i=0;
		while(i<n1 || i<n2) {
			if(i<n1) {
				merge.append(world1.charAt(i));
			}
			if(i<n2) {
				merge.append(world2.charAt(i));
				i++;
			}
			
		}
		return merge.toString();
	}
	public static void main(String[] args) {
		String word1="ABC";
		String word2="PQR";
		System.out.println(MeargeStringAlternately.mergealternately(word1, word2));
		
	}

}
