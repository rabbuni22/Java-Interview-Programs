import java.util.Scanner;

public class CharacterOccurance {

	public static void main(String[] args) {
		System.out.print("Enter a String:");
		Scanner sc=new Scanner(System.in);
	 String s=sc.nextLine();
		String m;
	String s1=	s.replaceAll("m", "");
	int count=s.length()-s1.length();
	System.out.println("Given chracter occurance is:"+count);

	}

}
