package test1;

import java.util.UUID;

public class Test4 {
	public static void main(String[] args) {
		UUID randomUUID = UUID.randomUUID();
		String random =	randomUUID.toString();
		//System.out.println(random);
		
		String str = "0123456789abcdefghijklmnopqrstuvwxyz";
		//生成长度为6的验证码
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 6; i++) {
			int index = (int)(Math.random() * str.length());
			sb.append(str.charAt(index));
		}
		System.out.println(sb);
	}
}
