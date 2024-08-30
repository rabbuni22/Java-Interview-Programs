package bb;

import java.util.ArrayList;

public class Employee {
	private int id;
	private double salary;
	
	public Employee(int id, double salary) {
		super();
		this.id = id;
		this.salary = salary;
		
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", getId()=" + getId() + ", getSalary()=" + getSalary()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

/*	ArrayList<Employee> al=new ArrayList();
	al.stream().sorted(Comparator.comparingDouble(Employee::getSalary))
	.map(x->x.getSalary())
	.skip(1)
	.findFirst()
	.collect(Collectors.toList());*/

}
