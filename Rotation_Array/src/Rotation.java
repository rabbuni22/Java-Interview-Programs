import java.util.Arrays;

public class Rotation {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8};
		forward(arr);
	}

	public static void forward(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			int first=arr[0];
			for(int j=0;j<arr.length-1;j++) {
			arr[j]=arr[j+1];
			}
			arr[arr.length-1]=first;
			System.out.print(Arrays.toString(arr));
			
		}
		
	}



}
