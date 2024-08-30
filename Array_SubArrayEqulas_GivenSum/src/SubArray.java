
public class SubArray {
	public static void main(String[] args) {
		
	
	int arr[]= {2,1,3,6,5,7};
	int N=10;
	 int start = 0,end = 0,wisum=0;
	 while(end<arr.length) {
		 wisum=wisum+arr[end];
		 if(wisum==N) {
			 System.out.println("First Index:"+arr[start]+"  Last Index"+arr[end]);
		 return;
		 }
		 while(wisum>N && start<=end) {
			 wisum=wisum-arr[start];
			 start++;
			 if(wisum==N) {
				 System.out.println("First Index:"+start+"  Last Index"+end); 
			return;
			 }
		 }
		 
		 
		 end++;
		 }
	
		 
	 }
	 
	 
	}
		 
	 
	
	


