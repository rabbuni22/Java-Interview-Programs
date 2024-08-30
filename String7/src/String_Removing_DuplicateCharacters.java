import java.util.LinkedHashSet;
import java.util.Set;

public class String_Removing_DuplicateCharacters {

	public static void main(String[] args) {
		
		/*
		 input=apple
		 output=aple
		 */
		String str="apple";
		StringBuilder sb=new StringBuilder();
		str.chars().distinct().forEach(c->sb.append((char)c));
		System.out.println(sb);
	System.out.println(".....................");
	StringBuilder sb1=new StringBuilder();
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		int idx=str.indexOf(ch, i+1);
		if(idx==-1) {
			sb1.append(ch);
		}

	}
	System.out.println(sb1);
	//Approach 3
	System.out.println(".....................");
	char arr[]=str.toCharArray();
	StringBuilder sb2=new StringBuilder();
	
	for(int i=0;i<arr.length;i++) {
		boolean repeated=false;
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]==arr[j]) {
			repeated=true;
			break;
		}
	}
	if(!repeated) {
		sb2.append(arr[i]);
	}

	
	}
	
	System.out.println(sb2);
	System.out.println("............");
	StringBuilder sb3=new StringBuilder();
	Set<Character> set=new LinkedHashSet<>();
	char arr1[]=str.toCharArray();
	for(char c:arr1) {
		set.add(c);
	}
	for(char h:set) {
		sb3.append(h);
	}
	
	System.out.println(sb3);
	}
	 
	}
	

	


