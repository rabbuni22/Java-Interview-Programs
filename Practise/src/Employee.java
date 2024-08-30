
public class Employee {
private int id;
private double sal;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
public Employee(int id, double sal) {
	super();
	this.id = id;
	this.sal = sal;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [id=" + id + ", sal=" + sal + "]";
}

}
