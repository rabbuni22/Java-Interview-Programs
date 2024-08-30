
public class Reverse {

	public static void main(String[] args) {
		String str="sukanya";
		System.out.println("Enter a String: "+str);
        String reversedString=reverse(str);
        System.out.println("Give the reversed String: "+reversedString);
	}

	private static String reverse(String str) {
		if(str==null || str.length()<=1) {
			return str;
		}
		return reverse(str.substring(1))+str.charAt(0);
		
	}

}
