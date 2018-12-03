package test3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("陈小龙");
		set.add("吴伟");
		set.add("abc");
		
		boolean result = set.add("吴伟");  //插入元素，并返回插入结果，true|false
		System.out.println(result?"插入成功":"插入失败");
		
		System.out.println("集合中元素的个数：" + set.size());
		set.remove("abc");  //删除对象
		
		/*
		 * Set接口中方法来自于Collection
		 * Collection中没有针对下标获取元素的方法
		 * 遍历HashSet时可用两种方法执行
		 * */
		//第一种方法,for-each循环
		/*
		 * for(元素类型  变量名 : 集合(数组))
		 * 
		 * */
		
		/*for(String str : set) {
			System.out.println(str);
		}*/
		
		
		/*
		 * 第二种方法，iterator() 迭代器
		 * */
		
		Iterator<String> it = set.iterator(); //泛型
		
		//循环次数不固定，通过while循环迭代
		while(it.hasNext()) {  //判断是否还有元素可供遍历
			String str = it.next();//将指针移动到元素上
			System.out.println(str);
		}
	}

}
