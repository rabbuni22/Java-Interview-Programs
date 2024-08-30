import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="rabbuni";
		String s[]=str.split("");
		Set<String> ss=new HashSet<String>();
		Set<String> unique=Arrays.stream(s).filter(a->!ss.add(a)).collect(Collectors.toSet());
		//System.out.println(Arrays.toString(s));
Map<String, Long> map=	Arrays.stream(s).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
System.out.println(map);
System.out.println(unique);
	
	int arr[]= {10,3,5,2,11,4,8};
	Integer integerList=Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	System.out.println(integerList);
	/**find the highest length of the string in array**/
	String sm[]= {"banana","apple","onion","sappotaa","Allvegetables"};
	String longString=Arrays.stream(sm).reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
	System.out.println(longString);
   List<String> al= Arrays.stream(arr).boxed().map(b-> b+ "").filter(b->b.startsWith("1")).collect(Collectors.toList());	
   System.out.println(al);
		}
	}


