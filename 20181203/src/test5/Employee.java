package test5;

/**
 * 员工类
 * @author Administrator
 *
 */
public class Employee {
	private int year;
	private String name;
	private double salary;//工资
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int year, String name, double salary) {
		super();
		this.year = year;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Empolyee [year=" + year + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
