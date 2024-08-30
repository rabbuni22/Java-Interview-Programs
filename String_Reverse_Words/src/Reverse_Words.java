
public class Reverse_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="This is My House";
String words[]=str.split(" ");
StringBuilder builder=new StringBuilder();
for(int i=words.length-1; i>=0;i--) {
	builder.append(words[i]).append(" ");
}
System.out.println(builder.toString());

	}

}
