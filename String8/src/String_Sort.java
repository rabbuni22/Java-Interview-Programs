
public class String_Sort {

	public static void main(String[] args) {
		// Approach 1
		int arr[]= {10,20,30,40,50,5};
		print(arr);
		reverse(arr,0,arr.length-1);
		print(arr);
		minimum(arr);
	}
	private static void minimum(int arr[]) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max =arr[i];
		}
		}
		System.out.println(max);
		
	}
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void reverse(int arr[],int start , int end) {
		while(start<end) {
			int temp;
			 temp= arr[start];
			 arr[start]=arr[end];
			 arr[end]=temp;
			 start++;
			 end--;
		}
	
		
	}	
		
	}


