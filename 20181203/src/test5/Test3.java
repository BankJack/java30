package test5;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Test3 {
	public static void main(String[] args) {
		/**
		 * 根据treeset的特性，即使年龄有重复的数据，也不能添加成功
		 */
		TreeSet<Student> tree = new TreeSet<>();//使用自然排序
		List<String> names = Arrays.asList("张三","李四","王五","赵六","张三丰","王富贵","赵得住");
		for (int i = 0; i < 10; i++) {
			
			int ran = (int)(Math.random() * names.size());
			int age = (int)(Math.random() * 10) + 18;
			
			Student stu = new Student(i + 1, names.get(ran), age);
			tree.add(stu); //学生对象插入到集合
		}
		
		//遍历集合
		for (Student stu : tree) {
			System.out.println(stu);
		}
	}
}
