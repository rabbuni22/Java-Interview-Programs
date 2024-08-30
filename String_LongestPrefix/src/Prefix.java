import java.util.Arrays;

public class Prefix {

	public static void main(String[] args) {
      String str[]= {"fk","flow","flw","flower","flight"};
      String pre= str[0];
     
     for(int i=1;i<str.length;i++) {
    	 while(str[i].indexOf(pre)!=1) {
    		 pre=pre.substring(0, pre.length()-1);
    	 }
     }
     System.out.println(pre);

	}

}
