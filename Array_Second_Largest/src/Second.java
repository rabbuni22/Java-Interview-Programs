
public class Second {

	public static void main(String[] args) {
		int arr[]= {2,10,5,9,3,22};
		int max=0;
		int second=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				second=max;
				max=arr[i];
				
			}else if (arr[i] > second && arr[i] != max) {
                second = arr[i];
			}   
		}
		System.out.println(second);

	}

}
