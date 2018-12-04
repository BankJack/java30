package test6;

import java.util.HashMap;
import java.util.Map;

import test5.Employee;

public class Test1 {

	public static void main(String[] args) {
		Map<String, Employee> map = new HashMap<>();
		
		//向集合中插入数据
		map.put("a", new Employee(1, "张三4", 4000));
		map.put("b", new Employee(2, "张三2", 3000));
		map.put("c", new Employee(3, "张三3", 3000));
		map.put("d", new Employee(4, "张三1", 2000));
		
		//通过key获取数据
		Employee e = map.get("a");
		//System.out.println(e);
		
		Employee remove = map.remove("d");//移除并返回被删除的元素
		//System.out.println(remove);
		
		map.clear();  //删除集合中所有元素
	}

}
