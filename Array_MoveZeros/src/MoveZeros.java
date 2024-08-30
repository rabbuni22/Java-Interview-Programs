
public class MoveZeros {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		MoveZeros.printArray();
	}
	  public static  void printArray() {
	    	 int[] arr= {20,0,2,0,3,4,0,5,0};
			int n=arr.length;
			move(arr,n);
	     }
	  public static  void message(int arr[],int n) {
	    	 for(int i=0;i<n;i++) {
	    		 System.out.print(arr[i]+" ");
	    	 }
	     }
	  public static void move(int arr[],int n) {
		  int j=0;
		  for(int i=0;i<n;i++) {
			  if(arr[i] != 0 && arr[j]== 0 ) {
				  int temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
			  }else if(arr[j]!=0) {
				  j++;
			 
			  }
			
		  }
		  message(arr, n);
		  
	  }


}
