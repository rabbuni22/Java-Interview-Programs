import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s=new LinkedHashSet();
		s.add(1);
		s.add(10);
		s.add(6);
		s.add(9);
		s.add(5);
		System.out.println(s);
		SortedSet ss=new TreeSet();
		ss.add(s);
		System.out.println(ss);
		

	}

}
