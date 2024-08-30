import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// rabbuni b is duplicate
		findDuplicate("rabbuni writing java program");

	}

	public static void findDuplicate(String str) {
		// TODO Auto-generated method stub
		char[] ch=str.toCharArray();
		HashMap<Character,Integer> map=new HashMap<>();
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		Set<Character> set=map.keySet();
		for(char ch1:set) {
			if(map.get(ch1)>1) {
				System.out.println(ch1+"....."+map.get(ch1));
			}
		}
		
	}

}
