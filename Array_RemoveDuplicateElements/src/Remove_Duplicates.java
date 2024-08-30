import java.util.Arrays;

public class Remove_Duplicates {

	public static void main(String[] args) {
		int arr[]= {1,12,3,3,4,5,6,4,5,8,9,9,7,5,29};
		Arrays.sort(arr);
		for(int i=0;i<arr.length; i++) {
			//System.out.print(arr[i]+" ");
		}
         int k=0;
		int result[]=new int[arr.length];
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				 result[k++]=arr[i];
			}
			result[k++]=arr[arr.length-1];
		}
		for(int j=0;j<k;j++) {
			System.out.print(result[j]+" ");
		}
		}
	}



