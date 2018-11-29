package test2;

public class Test {

	public static void main(String[] args) {
		String str = "你3好呀1,你在吗23";
		//第一种做法
		/*// ^是正则表达式的开头 ，另一层含义是非，在非时必须结合[]一起用
		String regex = "[^\\d]{1,}";
		str = str.replaceAll(regex, "");
		System.out.println(str);*/
		
		//第二种做法
		/*StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			int j = str.charAt(i);
			if (j >=48 && j <= 57) {
				sb.append((char)j);
			}
		}
		System.out.println(sb);*/
		
		
		//第三种，通过try-catch捕获异常的做法
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			String s = str.substring(i, i + 1);
			//尝试将s转换为数字，如果不报错则说明是数字
			
			//如果s不是数字，则抛出异常
			try {
				int num = Integer.parseInt(s);
				sb.append(num);
			} catch (NumberFormatException e) {
				//System.err.println("<" + s + ">不是数字"); //输出的文字是红色
			}
		}
		System.out.println(sb);
	}

}
