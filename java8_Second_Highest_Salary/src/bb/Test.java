package bb;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,0.0);
		Employee e2=new Employee(2,0.1);
		Employee e3=new Employee(3,0);
		Employee e4=new Employee(4,0);
		ArrayList<Employee> al=new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
	double es=	al.stream()
		.map(Employee::getSalary)
		.sorted(Comparator.reverseOrder())
		.skip(1)
		.findFirst()
		.orElseThrow(()->new RuntimeException("Element is not found:"));
	System.out.println(es);
		
	}

}
