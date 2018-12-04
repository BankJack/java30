package test6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import test5.Employee;

public class Test2 {

	public static void main(String[] args) {
		Map<String, Employee> map = new HashMap<>();
		
		//向集合中插入数据
		map.put("a", new Employee(1, "张三4", 4000));
		map.put("b", new Employee(2, "张三2", 3000));
		map.put("c", new Employee(3, "张三3", 3000));
		map.put("d", new Employee(4, "张三1", 2000));
		
		//获取键的集合
		Set<String> keySet = map.keySet();
		for (String s : keySet) {
			System.out.println(s);
		}
		
		//获取值的集合
		Collection<Employee> values = map.values();
		for (Employee e : values) {
			System.out.println(e);
		}
		
		Set<Entry<String, Employee>> entrySet = map.entrySet();
		for (Entry<String, Employee> entry : entrySet) {
			String key = entry.getKey(); //获取键
			Employee e = entry.getValue();	//获取值
			System.out.println("key：" + key + ",value：" + e);
		}
	}

}
