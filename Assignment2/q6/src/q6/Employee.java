package q6;

public class Employee {
	int id;
	String name;
	double sal;
	int age;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", age=" + age + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(int id, String name, double sal, int age) {
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.age = age;
	}
	public Employee() {
		id = 0;
		name = "Saitama";
		sal = 00;
		age = 0;
	}
	
}
