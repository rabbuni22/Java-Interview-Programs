
public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str="abcde";
   char arr[]=str.toCharArray();
   int fi=0;
   permutation(arr,fi);
 
	}
   	
   static void permutation(char[] arr,int fi) {
	   if(fi==arr.length-1) {
		   System.out.println(arr);
		   return;
	   }else {
		   for(int i=fi;i<arr.length;i++) {
			   swap(arr,fi,i);
			   permutation(arr,fi+1);
			   swap(arr,fi,i);
		   }
	   }
	   
   }
   static void swap(char[] arr,int fi,int i) {
	   char temp;
	   temp=arr[i];
	   arr[i]=arr[fi];
	   arr[fi]=temp;
	   
   }
   
	

}
