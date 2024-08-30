import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

	import java.util.*;

	public class Even {
	    public static void main(String[] args) {
	        List<Integer> al = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
	        List<List<Integer>> pairs = createPairs(al);
	        
	        // Print pairs
	        for (List<Integer> pair : pairs) {
	            System.out.println(pair);
	        }
	    }
	    
	    public static List<List<Integer>> createPairs(List<Integer> al) {
	        List<List<Integer>> pairs = new ArrayList<>();
	        
	        for (int i = 0; i < al.size(); i += 2) {
	            List<Integer> pair = new ArrayList<>();
	            if (i + 1 < al.size()) {
	                pair.add(al.get(i));
	                pair.add(al.get(i + 1));
	                pairs.add(pair);
	            } else {
	                // If there's an odd number of elements, add the last element as a single element pair
	                pair.add(al.get(i));
	                pairs.add(pair);
	            }
	        }
	        
	        return pairs;
	    /*
	    	List<String> strings = Arrays.asList("",null,"kris","amk","tex");
	    	StringBuffer sb=new StringBuffer();
	    	for(String s:strings){
	    		if((s!="")&& (s!=null)) {
	    	sb.append(s+",  ");
	    		}
	    	}
	    	System.out.println(sb.toString());*/

	    	
	    }
	}



