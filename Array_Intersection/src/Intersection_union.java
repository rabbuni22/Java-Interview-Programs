import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

public class Intersection_union {

	public static void main(String[] args) {
		StringJoiner sj1=new StringJoiner(",");
		sj1.add("a").add("B").add("C");
		System.out.println(sj1);
		StringJoiner sj2=new StringJoiner(":");
		sj2.add("p").add("q");
		System.out.println(sj2);
		sj1.merge(sj2);
		System.out.println(sj1);
		
		
		int arr1[]=new int[] {2,4,3,6,9,10,10,4};
        int arr2[]=new int[] {4,3,6,10,11};
		printIntersection(arr1,arr2);
		printUnion(arr1,arr2);

	}
	

	private static void printIntersection(int[] arr1, int[] arr2) {
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		System.out.print("The intersection elements are: ");
		for(int i=0;i<arr2.length;i++) {
			
			if(set.contains(arr2[i])) {
				System.out.print(arr2[i]+" ");
			}
		}
		
		
	}
	
	private static void printUnion(int[] arr1, int[] arr2) {
		Set<Integer> set=new HashSet<>();
		System.out.println();
		System.out.print("Union elements of both the arrays are: ");
		for(int i=0;i<arr1.length;i++) {
		set.add(arr1[i]);
		
		}
		for(int i=0;i<arr2.length;i++) {
			set.add(arr2[i]);
			
			}
		System.out.print(set);
		
	}

}
