import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Employee> list=new ArrayList<>();
list.add(new Employee(1,200));
list.add(new Employee(2,300));
list.add(new Employee(3,400));
list.add(new Employee(4,500));
list.add(new Employee(5,600));
List<Employee> sorted=list.stream().sorted((e1,e2)->(int)(e1.getSal()-e2.getSal())).collect(Collectors.toList());
System.out.println(sorted);
	}

}
