package test1;

public class Test2 {

	/**
	 * 装箱和拆箱
	 * @param args
	 */
	public static void main(String[] args) {
		int i = new Integer("345");
		i = new Integer(123);
		
		//使用基本数据类型保存一个引用数据类型的Integer 拆箱
		
		Integer i2 = 123;  //装箱
		Integer i3 = 123;
		System.out.println(i2 == i3);
		
		/*
		 * Integer为了提高效率，内部的池缓存-128~127的数字
		 * 在这个范围内的数字会存放在缓存池中
		 * */
		Integer i4 = 128; //超出池的取值范围，new了一个新的对象
		Integer i5 = 128; //超出池的取值范围，new了一个新的对象
		System.out.println(i4 == i5);
		
	}

}
