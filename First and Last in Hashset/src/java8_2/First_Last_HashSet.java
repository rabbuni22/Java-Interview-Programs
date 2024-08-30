package java8_2;

import java.util.HashSet;

public class First_Last_HashSet {
	public static void main(String[] args) {
		String firstElement=null;
		String lastElement=null;
		HashSet<String> hash=new HashSet<>();
		hash.add("josh");
		hash.add("joul");
		hash.add("jonna");
		hash.add("jiddu");
		System.out.println(hash);
		firstElement=hash.stream().findFirst().get();	
		System.out.println(firstElement);
		lastElement=hash.stream().reduce((first,second)->second).get();	
	   System.out.println(lastElement);	
	}
        
}
