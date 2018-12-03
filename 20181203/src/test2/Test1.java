package test2;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * 在JDK8之前，声明集合的语法
		 * 	List<String> list = new ArrayList<String>();
		 * 
		 * 在JDK8之后，在声明集合时，List<String>已经指定了集合中每个元素的类型
		 * 因此，实例化ArrayList时，可以推断出集合中每个元素的类型为String
		 * 所以在JDK8之后，可以省略掉ArrayList<>
		 * */
		List<String> list = new ArrayList<>();
		
		list.add("a");
		list.add("b");
		list.add(0, "c");//将c插入到集合中的0下标
		
		List<String> list2 = new ArrayList<>();
		list2.add("e");
		list2.add("f");
		
		list.addAll(list2);
		
		//根据下标获取元素
		String str1 = list.get(0);
		//System.out.println(str1);
		
		String str2 = list.set(1, "@");//根据下标修改元素，返回修改之前的元素
		System.out.println("@替换了：" + str2);
		
		//list.remove(1); //移除指定下标的元素并返回
		list.remove("@"); //移除对象，使用这种方法，元素必须重写equals方法,返回布尔值
		//遍历集合
		for (int i = 0; i < list.size(); i++) { //size() 返回集合中存储元素的个数
			String str = list.get(i);
			System.out.println(str);
		}
		
		
	}

}
