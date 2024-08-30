import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		isAnagram("ravi","vira");
	}
		static boolean isAnagram(String word1, String word2){
		char character1[]=	word1.toCharArray();
		char character2[]=	word2.toCharArray();
		Arrays.sort(character1);
		Arrays.sort(character2);
		//System.out.println("both are anagram");
		return Arrays.equals(character1, character2);
		
		
			}
	
		}

