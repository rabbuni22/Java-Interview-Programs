import java.util.Scanner;

public class CountOf_Vowels {
public static void main(String[] args) {
	int count=0;
	System.out.println("Enter String");
	Scanner s=new Scanner(System.in);
	String input=s.nextLine();
	char[] characters=input.toCharArray();
	for(char c:characters) {
		switch(c){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			count++;
			break;
			default:
			
		}
		System.out.println("no of vowels in a string "+input+":"+count);
	}

	
}
}
