import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter{
	public static void main(String[] args) {
	//	find("ravi");
		find("lwlama");
		
	}
		public static  char find(String word){
		char character[]=	word.toCharArray();
			Map<Character,Integer> map=new LinkedHashMap<>();
			for(char c: character) {
				if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
				}
			else {
				map.put(c, 1);
			}
			}
			for(Map.Entry<Character,Integer>  entry: map.entrySet()) {
				if(entry.getValue()==1) {
					System.out.println( entry.getKey()+":"+ entry.getValue());
					return entry.getKey();
				}
			}
			throw new RuntimeException("didn't find any non repeated Character");
		}
	

}
