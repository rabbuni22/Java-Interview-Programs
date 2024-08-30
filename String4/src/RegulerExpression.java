import java.util.regex.Pattern;

public class RegulerExpression {
	public static void main(String[] args) {
		String[] inputs= {"123","-123","123.12","123abc"};
		Pattern pattern=Pattern.compile(".*[^0-9].*");
		for(String input:inputs) {
			System.out.println("does"+input+"is a number:"
					+!pattern.matcher(input).matches()); 
		}
		
		String[] digit= {"abcde","abc123","12345"};
		Pattern pat=Pattern.compile("\\d{6}");
		for(String aa: digit) {
			System.out.println("does"+aa+"is a 6 digit"
					+ pat.matcher(aa).matches());
		}
	}

}
