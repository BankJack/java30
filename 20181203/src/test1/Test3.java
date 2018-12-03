package test1;

public class Test3 {

	public static void main(String[] args) {
		Integer i = new Integer("123");
		Byte b = new Byte("127");
		Short s = new Short("111");
		Double d = new Double("3.14");
		
		i.intValue(); //将Integer转换为int
		b.byteValue();
		s.shortValue();
		d.doubleValue();
		
		int max = Integer.MAX_VALUE; //获取int类型的最大值
		int min = Integer.MIN_VALUE; //int的最小值
		
		// Integer.max(a, b);   返回a和b两个参数中最大的那个值
		//Integer.min(a, b);	返回a和b中最小值
	
	}

}
