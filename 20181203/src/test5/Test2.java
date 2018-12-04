package test5;

public class Test2 {

	public static void main(String[] args) {
		Integer i1 = 456;
		Integer i2 = 456;
		
		System.out.println(i1.hashCode() == i2.hashCode());
		System.out.println(i1.equals(i2));
		System.out.println(i1 == i2);
	}

}
