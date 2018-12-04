package test6;

import java.util.HashMap;
import java.util.Map;

import test5.Employee;

public class Test3 {

	public static void main(String[] args) {
		Map<String, Employee> map = new HashMap<>();
		
		//向集合中插入数据
		map.put("a", new Employee(1, "张三4", 4000));
		map.put("b", new Employee(2, "张三2", 3000));
		map.put("c", new Employee(3, "张三3", 3000));
		map.put("d", new Employee(4, "张三1", 2000));
		
		//遍历集合
		for (String key : map.keySet()) { //遍历键的集合
			Employee value = map.get(key);
			System.out.println(value);
		}
	}

}
