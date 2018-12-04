package test5;

/**
 * 学生类
 * @author Administrator
 *
 */
public class Student implements Comparable<Student>{
	private int num;//学号
	private String name;
	private int age;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(int num, String name, int age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (num != other.num)
			return false;
		return true;
	}
	@Override
	public int compareTo(Student o) {
		/* 根据学生年龄排序
		 * 年龄相同则返回0
		 * 当前比较的学生年龄比目标学生O的年龄大，则返回正数，否则负数
		 */
		return this.age - o.getAge();
	}
	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
