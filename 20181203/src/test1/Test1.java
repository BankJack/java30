package test1;

public class Test1 {

	public static void main(String[] args) {
		String num = "123";
		
		//如何将num转换为int
		int i = Integer.valueOf(num);
		
		//将num转换为byte
		byte b = Byte.valueOf(num);
		
		//将num转为short
		short s = Short.valueOf(num);
		
		float f = Float.valueOf(num);
		
		double d = Double.valueOf(num);
		
		//将整数转换为String
		String s1 = i + "";
		String s2 = String.valueOf(i);//将整数转换为String
	}

}
