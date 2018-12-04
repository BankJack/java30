package test4;

import java.util.Collection;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {
		Collection<Object> c = new MyCollection<>();
		
		/*
		 * 匿名实现
		 * 
		 * 对于抽象类和接口中的方法都是抽象方法
		 * 抽象方法没有方法体，必须重写
		 * */
		MyInterface i = new MyInterface() {
			
			@Override
			public void test2() {
				System.out.println("test2");
			}
			
			@Override
			public void test1() {
				System.out.println("test1");
			}
		};
		
		
		i.test1();
		i.test2();
	}

}
