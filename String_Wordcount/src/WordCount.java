import java.util.HashMap;
import java.util.Set;
/*first i take a string 
 * converted as array using split method where space is there
 * i created hashmap object with key value
 * i put each word in a string into hash map
 * i take the unique string words from hash map by using keyset() from set interface
 * after that i calculate the each word with their count
 */

public class WordCount {
	public static void findWordCount(String str){
		String[] words=str.split(" ");
		HashMap<String,Integer> map=new HashMap();
		for(String word:words) {
			if(map.containsKey(word)) {
				map.put(word,map.get(word)+1);
			}else {
				map.put(word,1);
			}
		}
		Set<String> set=map.keySet();
		for(String word1:set) {
			
				System.out.println(word1+" "+map.get(word1));
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//findWordCount("Hi this is ramu learning technologies like java is technologies");
findWordCount("aa bb cc abc aabc abc bb cc aa");
	}

}
