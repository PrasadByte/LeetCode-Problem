package linkedList;

public class Practice {
	public static String alternatelyString(String word1, String word2) {
		StringBuilder merge=new StringBuilder();
		int n1= word1.length();
		int n2= word2.length();
		int i=0;
		while(i<n1 || i<n2) {
			if(i<n1) {
				merge.append(word1.charAt(i));
			}
			if(i<n2) {
				merge.append(word2.charAt(i));
				i++;
			}
		}
		return merge.toString();
	}
	public static void main(String[] args) {
		String w1= "HFJDHG";
		String w2 =" mhhgh";
		System.out.println(Practice.alternatelyString(w1, w2));
	}


}
