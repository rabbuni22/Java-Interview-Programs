
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5,6,8};
int sum=8*9/2;//n(n+1)/2
int actualSum=0;

for(int i=0;i<arr.length;i++) {
	
	actualSum=actualSum+arr[i];
}
System.out.println("Missing Number is :"+(sum-actualSum));
	}

}
