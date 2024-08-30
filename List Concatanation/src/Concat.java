import java.util.ArrayList;
import java.util.List;

public class Concat {
	/*list1 = [[1,3],[8,10],[15,18]];
	 list2 = [[4,7],[11,14]];*/
	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList();		
ArrayList<Integer> sub1=new ArrayList();
sub1.add(1);
sub1.add(3);
ArrayList<Integer> sub2=new ArrayList();
sub2.add(8);
sub2.add(10);
ArrayList<Integer> sub3=new ArrayList();
sub3.add(15);
sub3.add(18);
list1.addAll(sub1);
list1.addAll(sub2);
list1.addAll(sub3);
System.out.println("First list is"+list1);


}
}
