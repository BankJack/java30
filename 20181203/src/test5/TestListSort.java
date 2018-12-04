package test5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 通过定制排序对对象数组及集合进行排序
 * @author Administrator
 *
 */
public class TestListSort {

	public static void main(String[] args) {
		//sortList();
		sortArrays();
	}

	private static void sortList() {
		Employee e1 = new Employee(3, "张三4", 4000);
		Employee e2 = new Employee(2, "张三2", 3000);
		Employee e3 = new Employee(3, "张三3", 3000);
		Employee e4 = new Employee(1, "张三1", 2000);
		
		List<Employee> list = Arrays.asList(e1,e2,e3,e4);
		
		//排序
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				/*
				 * 工具工资升序排序
				 * 如果工资相同，根据工龄降序排序
				 * */
				if (o1.getSalary() == o2.getSalary()) {
					return o2.getYear() - o1.getYear(); //降序
				}
				return (int)(o1.getSalary() - o2.getSalary()); //升序
			}
		});
		
		for (Employee e : list) {
			System.out.println(e);
		}
	}
	
	/**
	 * 对象数组也可以通过定制排序对对象数组排序
	 */
	private static void sortArrays() {
		Employee e1 = new Employee(3, "李四1", 4000);
		Employee e2 = new Employee(2, "李四2", 3000);
		Employee e3 = new Employee(3, "李四3", 3000);
		Employee e4 = new Employee(1, "李四4", 2000);
		Employee[] es = {e1,e2,e3,e4};
		
		//通过Arrays.sort()方法排序
		Arrays.sort(es, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				/*
				 * 工具工资升序排序
				 * 如果工资相同，根据工龄降序排序
				 * */
				if (o1.getSalary() == o2.getSalary()) {
					return o2.getYear() - o1.getYear(); //降序
				}
				return (int)(o1.getSalary() - o2.getSalary()); //升序
			}
		});
		
		//遍历数组
		for (Employee e : es) {
			System.out.println(e);
		}
	}

}
