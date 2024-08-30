import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="rabbuni";
		
		
		char[] character=word.toCharArray();
		Map<Character, Integer> map=new HashMap<>();
		for(char ch:character) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else
				map.put(ch, 1);
		}
	//	System.out.print(map);
		Set<Map.Entry<Character,Integer>> set=map.entrySet();

		for(Map.Entry<Character, Integer> eset: set) {
			if(eset.getValue()>1) {
				System.out.println(eset.getKey()+":"+eset.getValue());
		
	

}
		}
	}
}

	
