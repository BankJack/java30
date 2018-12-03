package test2;

import java.util.LinkedList;

public class Test3 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("a");
		list.add("b");
		list.addFirst("first");  //将元素插入到集合的头部
		list.add("c");
		list.add("e");
		list.addLast("last");  //将元素插入到集合的尾部
		
		String frist = list.getFirst(); //获取第一个元素
		String last = list.getLast();  //获取最后一个元素
		
		list.removeFirst(); //移除并返回第一个元素
		list.removeLast();  //移除并返回最后一个元素 
		
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
	}

}
