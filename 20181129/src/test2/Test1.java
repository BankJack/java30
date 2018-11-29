package test2;

public class Test1 {

	public static void main(String[] args) {
		String str = "z3acyd@2";
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			int j = str.charAt(i);
			//只对a-z的字母转换  a:97   z:122
			if (j >= 97 && j <= 122) {
				if (j == 122) { //将z变成a
					j = 97;
				} else {
					j++; //a变成b
				}
			}
			sb.append((char)j);
		}
		System.out.println(sb);
	}

}
