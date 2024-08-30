

public class Count_Occurence_Of_Character {
public static void main(String[] args) {
	String input="Today is my wedding annevarsary";
	int count=0;
	for(int i=1; i<input.length();i++){
		if(input.charAt(i)=='n'){
			count++;
			System.out.println("occurences of charater is:" +count);
		}
	}
}
}
