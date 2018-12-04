package test4;

/**
 * 外部类
 * @author Administrator
 *
 */
public class Outter {

	/**
	 * 内部类
	 * @author Administrator
	 *
	 */
	public class Inner1{
		public Inner1() {
			System.out.println("调用Inner的构造方法");
		}
	}
	
	/**
	 * 内部类
	 * 被static修饰的内部类不能够被其他的类实例化
	 * @author Administrator
	 *
	 */
	public static class Inner2{
		public Inner2() {
			System.out.println("调用Inner的构造方法");
		}
	}
	
	public Inner2 getInner2() {
		return new Inner2();
	}
}

/**
 * 这不是内部类
 * @author Administrator
 *
 */
class Test{
	
}
