import java.util.Scanner;

public class Permu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		char ch[]=str.toCharArray();
		permu(ch,0);
	}
		public  static void permu(char ch[],int fi) {
			if(fi==ch.length-1) {
				System.out.println(ch);
				return;
			}else {
		     for(int i=fi;i<ch.length;i++) {
			  swap(ch,i,fi);
			  permu(ch,fi+1);
			  swap(ch,i,fi);
			}
			
		}
		
	}

	private static void swap(char[] ch, int i, int fi) {
			char temp=ch[i];
			ch[i]=ch[fi];
			ch[fi]=temp;
			}
	
		
	} 
		


		
	




