package test4;

import test4.Outter.Inner1;
import test4.Outter.Inner2;

public class Demo {

	public static void main(String[] args) {
		//创建内部类的对象
		/*
		 * 创建内部类的对象时必须先实例化外部类的对象
		 * */
		Inner1 inner = new Outter().new Inner1();
		
		/*
		 * 内部类有static修饰，说明该内部类依赖于外部类
		 * 除了外部类以外，不能够在其他地方实例化内部类的对象
		 * */
		Inner2 inner2 = new Outter().getInner2();
		
		
	}

}
